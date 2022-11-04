class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] num = new int[]{0,1,2,3,4,5,6,7,8,9};
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < num.length; j++) {
                if(numbers[i] != num[j]) {
                    answer += numbers[i];
                }
            }
        }
        return answer;
    }
}
