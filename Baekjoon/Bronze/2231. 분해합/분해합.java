import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < N; i++) {
            int number = i; //생성자
            int sum = 0;

            // 생성자의 자릿수 합 구하기
            while (number >0 0) {
                sum += number % 10;
                number /= 10;
            }

            // 생성자의 자릿수 합 + i(생성자) 가 N과 같다면 빠져나와
            if (sum + i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
