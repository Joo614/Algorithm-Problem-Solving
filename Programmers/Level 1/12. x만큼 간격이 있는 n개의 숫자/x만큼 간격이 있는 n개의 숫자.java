class Solution {
    public long[] solution(int x, int n) {
        
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
            answer[i] = (long)x * (i+1); //x는 int니까 더 넓은 범위를 위해 long으로 형변환 해줘야함
        }
        
        return answer;
    }
}
