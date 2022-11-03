class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        //signs의 i번째가 false면 absolutes의 sum에서 i번째 요소를 빼주고
        //true면 더해
        
        int sum = 0;
        
        for(int i = 0; i < signs.length; i++) {
            if(signs[i] == false) {
                sum -= absolutes[i];
            } else {
                sum += absolutes[i];
            }
        }

        return sum;
    }
}
