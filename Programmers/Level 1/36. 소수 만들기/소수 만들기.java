class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j <nums.length; j++) {
                for (int k = (j + 1); k < nums.length; k++) {
                  
                    int sum = nums[i] + nums[j] + nums[k];
                  
                    boolean confirm = true;
                  
                    for (int l = 2; l < sum; l++) {
                        if (sum % l == 0) {
                            confirm = false;
                        }
                    }
                    if (confirm) answer++;
                }
            }
        }

        return answer;
    }
}

/////// 다른 풀이 ///////

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++){
                    
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    answer += isPrime(sum) ? 1 : 0;
                }
            }
        }

        return answer;
    }
  
    private boolean isPrime(int num) {
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // 나눠 떨어질 경우
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
