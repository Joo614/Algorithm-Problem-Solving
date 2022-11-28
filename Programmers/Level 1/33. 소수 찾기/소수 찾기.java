class Solution {
    public int solution(int n) {
        // 소수 - 1과 자신으로만 나누어지는 수 / 1은 소수 아님
        int answer = 0;
          
          int[] number = new int[n+1];
          
          //2부터 n까지의 수를 배열에 넣음
          for(int i=2; i<=n; i++) {
              number[i] = i;
          }
          
          // 2부터 시작해서 그의 배수들을 0으로 만듦
          // 후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만듦
          for(int i=2; i<=n; i++) {
              if(number[i]==0) continue;
              
              for(int j= 2*i; j<=n; j += i) {
                  number[j] = 0;
              }
          }
          
          // 배열에서 0이 아닌 것들의 개수 셈
          for(int i=0; i<number.length; i++) {
              if(number[i]!=0) {
                  answer++;
              }
          }
        
          return answer;        
    }  
}

/////// 다른 풀이 ///////

class Solution {
    public int solution(int n) {
        int result = 0;

        for(int i = 2; i <= n; i++){
            boolean flag = false;
            for(int j = 2; j < i; j++){
                if(i % j == 0 ){ //약수가 하나라도 있으면 플래그 세움
                    flag = true;
                }               
            }
            if(flag == false )
                result++;
        }
        return result; //2부터 n까지의 소수의 개수 (1은 소수가 아님)
    }  
}
