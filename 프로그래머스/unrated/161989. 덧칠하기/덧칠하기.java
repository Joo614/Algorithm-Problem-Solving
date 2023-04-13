class Solution {
    public int solution(int n, int m, int[] section) {
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