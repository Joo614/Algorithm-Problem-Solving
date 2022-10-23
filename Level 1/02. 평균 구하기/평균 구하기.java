class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        //arr의 모든 요소를 더하고
        //arr의 길이만큼 나눈 것이 answer
        
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = sum / arr.length;
        
        return answer;
    }
}
