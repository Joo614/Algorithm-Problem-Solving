import java.util.*;

public class Solution { 
	public int orderOfPresentation(int N, int[] K) {
    int order = 0;

    boolean[] isUsed = new boolean[N + 1];

    for (int i = 0; i < K.length; i++) {
      int num = K[i];
      isUsed[num] = true;
      boolean[] candidates = Arrays.copyOfRange(isUsed, 1, num);
      int validCnt = 0;
      for (boolean candidate : candidates) if (!candidate) validCnt++;
      int formerCnt = validCnt * factorial(N - i - 1);
      order = order + formerCnt;
    }
    return order;
  }

  public int factorial(int n) {
    if(n <= 1) return 1;
    return n * factorial(n - 1);
  }
}
