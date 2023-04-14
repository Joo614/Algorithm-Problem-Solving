class Solution {
    public static int solution(int number, int limit, int power) {
        int sum = 0;

        for (int num = 1; num <= number; num++) {
            int divisor = Divisor(num);
            sum += divisor > limit ? power : divisor;
        }

        return sum;
    }

    private static int Divisor(int num) {
        int count = 0;

        // 절반까지만 계산 
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        }

        return count;
    }
}