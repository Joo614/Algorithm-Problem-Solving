import java.util.*; //import 하기

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
      
        if(answer.length == 0) answer = new int[] {-1};
      
        Arrays.sort(answer); //정렬
      
        return answer;
    }
}

///////다른 풀이//////

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                count++;
            }
        }
        if(count == 0) { //나누어 떨어지는 수가 0이면
            int answer[] = {-1}; //answer에 -1을 저장
            return answer; //답 반환
        }

        int[] answer = new int[count]; //나누어 떨어지는 수의 개수만큼의 배열을 만들고
        
        for (int i = 0, j =0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                answer[j] = arr[i]; //하나씩 추가
                j++;
            }
        }
        
        Arrays.sort(answer); //정렬
        
        return answer;
    }
}
