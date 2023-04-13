class Solution {
    public int solution(int n, int m, int[] section) {
        // 처음 인덱스 값부터 폼롤러를 돌리기 때문에 --> answer의 값 1 증가
        // 배열의 값이 m의 값보다 커질때 --> answer의 값 1 증가
        // ==> 덧칠해야하는 최소한의 수
        
        int answer = 0;
        int now = section[0];
        int idx = 0;
        
        while(idx<section.length){
            if(now<=section[idx]){
                now = section[idx] + m;
                answer++;
            }
            idx++;
        }
        return answer;
    }
}
