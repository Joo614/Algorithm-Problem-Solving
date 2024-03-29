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
            while (number > 0) {
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

------- 다른 풀이 -------

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

        for(int i = (N - (N_len * 9)); i < N; i++) { // 자세한 풀이는 intellij에
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
