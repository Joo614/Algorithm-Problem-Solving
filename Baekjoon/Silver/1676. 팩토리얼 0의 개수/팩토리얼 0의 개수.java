import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0; // 0의 개수 카운트

        BigInteger big = new BigInteger("1");
        // 객체 생성 후 1로 초기화 --> 문자열 "1"을 가지는 BigInteger 객체 생성
        // 이후 이 객체에 다른 객체값을 곱해줄 것이기 때문에 0이 아닌, 1로 초기화

        // N! 계산
        for (int i = 1; i <= N; i++) {
            big = big.multiply(BigInteger.valueOf(i)); // 객체끼리의 연산이기 때문에 *= 사용 불가
        }

        String str = big.toString();
        for (int i = str.length() - 1; i > 1; i--) { // 뒤부터 자릿수 확인
            if (str.charAt(i) == '0') count++;
            else break;
        }

        System.out.println(count);
    }
}

/////// 다른 풀이 ///////

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0; // 5의 배수의 개수 count --> 0의 개수

        // count에 5의 배수의 개수 누적 / N은 5로 나누어 갱신 --> 최종적으로 누적된 5의 배수의 개수로 뒤에 붙은 0의 개수를 구할 수 있음
        while(N >= 5) { // Ex. N == 1200
            count += N/5;
            // 1. count == 240 / 2. count == 240 + 48 == 288 / 3. count == 288 + 9 == 297 / 4. count == 297 + 1 == 298 (아래 각 5의 배수의 개수를 합친 값)

            N /= 5;
            // 1. N = 240(5의 배수의 개수) / 2. N == 48(25의 배수의 개수) / 3. N == 9(125의 배수의 개수) / 4. N == 1(625의 배수의 개수)
        }

        System.out.println(count);
    }
}
