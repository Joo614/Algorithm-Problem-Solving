import java.util.*;

public class Solution { 
  public int fibonacci(int num) {
    ArrayList<Integer> memo = new ArrayList<>();
    memo.add(0);
    memo.add(1);

    return aux(memo, num);
  }
	
  public int aux(ArrayList<Integer> memo, int num) {
    if (memo.size() <= num) {
      memo.add(aux(memo, num - 1) + aux(memo, num - 2));
    }
    return memo.get(num);
  }
}
