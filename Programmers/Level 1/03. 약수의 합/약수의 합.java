class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //약수 n을 나누었을 때 나머지가 0인 것
        //answer은 약수들을 더한 값
        
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
