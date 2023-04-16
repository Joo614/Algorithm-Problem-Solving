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

/////// 다른 풀이 ////////

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;

        for (int i = 2; i <= number; ++i) {
            int count = 0;

            for (int j = 1;  j * j <= i; ++j) {
                if (i % j == 0) {
                    count += (j * j == i) ? 1 : 2;
                }

                if (count > limit) {
                     count = power;
                    break;
                }
            }
            answer += count;
        }
        return answer;
    }
}
