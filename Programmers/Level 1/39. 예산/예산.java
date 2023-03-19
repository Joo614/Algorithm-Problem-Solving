import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        // 최대한 많은 부서의 물품을 구매해 줄 수 있도록
        // 신청한 금액만큼 모두 지원 - 더 적은 금액 주면 안됨
        // 신청한 금액이 들어있는 배열 d / 예산
        // 최대 몇개의 부서에 물품을 지원할 수 있는지    

        Arrays.sort(d);

        int sum = 0; // 총 금액
        int count = 0; // 몇 부서 지원할 수 있는지

        Arrays.sort(d);   

        for(int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                count = i;
                break;
            }
        }
        if (sum <= budget) {
            count = d.length;
        }

        return count;
    }
}

////// 다른 풀이 ///////

import java.util.*;

class Solution {
  public int solution(int[] d, int budget) {
      int answer = 0;

      Arrays.sort(d);

      for (int i = 0; i < d.length; i++) {
          budget -= d[i];

          if (budget < 0) break;
          answer++;
      }
      
      return answer;
  }
}
