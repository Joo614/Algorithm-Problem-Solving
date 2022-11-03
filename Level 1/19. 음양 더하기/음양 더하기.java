class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        //signs의 i번째가 false면 absolutes의 i번째 요소에 -를 붙이고
        //true면 그냥 아무것도 붙이지 않고
        //새 배열에 넣어
        //그리고 absolutes 배열 돌면서 하나씩 더해서 합을 리턴
        
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
