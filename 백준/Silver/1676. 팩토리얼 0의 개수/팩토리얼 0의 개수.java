import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0; // 0의 개수 카운트

        BigInteger big = new BigInteger("1"); // 객체 생성 후 1로 초기화

        // N! 계산
        for (int i = 1; i <= N; i++) {
            big = big.multiply(BigInteger.valueOf(i)); // 객체끼리의 연산이기 때문에 *= 사용 불가
        }

        String str = big.toString();
        for (int i = str.length() - 1; i > 1; i--) { // 뒤부터 자릿수 확인
            if (str.charAt(i) - '0' == 0) count++; // 0이 맞으면 count++
            else break;
        }

        System.out.println(count);
    }
}