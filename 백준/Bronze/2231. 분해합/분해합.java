import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N이 몇자릿수 숫자인지 알기위해 일단 문자열로 입력받음
        String str_N = br.readLine();

        int N_len = str_N.length(); // 길이 추출

        // 문자열을 정수(int)로 변환
        int N = Integer.parseInt(str_N);
        int result = 0;

        for(int i = (N - (N_len * 9)); i < N; i++) {
            int number = i; //생성자
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}