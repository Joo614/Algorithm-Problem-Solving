class Solution {
    public int solution(int a, int b, int n) {
        // 빈 병 개수가 a개보다 미민인 경우와 이상일 경우로 나누어 진행하기
        // a개보다 미만일 경우 --> 리턴
        // a개 이상일 경우 --> 빈병 개수를 a개로 나누어서 돌려받는 개수를 곱해주면 됨 
        // 나머지를 구하고 빈병의 개수인 n에 위의 값과 나머지 병을 더해주는 것을 while문 돌리면 됨
      
        int answer = 0;
      
        while(true) { // while문돌려서
            // 가지고 있는 빈 병 수가 a개보다 미만이면 return
            if(n < a) {
                break;
            }
            
            // 가지고 있는 빈 병 수가 a개보다 크면 시작   
            answer += (n / a) * b; // answer에 n에서 a를 나눈 몫에 교환받는 콜라 수 b를 곱해서 넣어줌
            
            n = ((n/a)*b)+(n%a); // n을 answer에 넣어준 만큼과 a로 나눈 나머지를 더하여 구현
        }
        return answer;
    }
}

/////// 다른 풀이 ///////  

class Solution {
    public int solution(int a, int b, int n) {
      
        int answer = 0;

        while (n >= a) { // 위와 다른 게 여기는 아예 이걸 이렇게 제한하고 나머지 해줌
            answer += b * (n / a);
            n = b * (n / a) + n % a;
        } 
        return answer;
    }
}
