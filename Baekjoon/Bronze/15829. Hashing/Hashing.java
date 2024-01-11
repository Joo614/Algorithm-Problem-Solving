import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine()); // 문자열 길이
        String str = br.readLine(); // 소문자로 이루어진 문자열 (공백 x)

        // 해시 함수의 상수값 설정
        int r = 31; // 거듭제곱에 사용될 숫자 --> 보통 알파벳 수 26보다 큰 소수로 선택 --> 같은 문자열이라도 순서를 바꾸더라도 다른 해시값이 나오게 됨
        long M = 1234567891; // 나눗셈 연산에 사용될 숫자 --> 출분히 큰 소수를 선택하여 최종 해시값으로 나눌 때 충돌을 최소와 ( 임의로 선택된 값이지만 충돌을 최소화하는 데 효과적 )
        // 나눗셈 연산의 결과값이 int형보다 커질 수 있으므로 long형

        long hash = 0; // 최종 해시값

        // 문자열을 수열로 변환하여 해시값 계산
        for (int i = 0; i < L; i++) {
            char ch = str.charAt(i); // 각 자리의 알파벳을 문자형으로 변환

            int alphabet = ch - 'a' + 1; // 'a' == 97 (아스키코드 값)
            // ch와 a 사이의 거리를 구한 후에 1을 더하여 / 각 문자를 1부터 26까지의 숫자로 매핑 / Ex. 'a' - 1 , 'b' - 2 이런식으로 매핑되어 저장

            long term = (long) Math.pow(r, i) % M; // 항
            // Math.pow(r, i) -> r을 i번 거듭제곱한 값 계산 / 반환값은 double 형
            // % M 으로 나머지 연산 --> 중간 결과의 크기를 제한하기 위해
            // 해시함수에서는 일반적으로 큰 수를 작은 수로 변환하고자 할 때, 나머지 연산을 사용하여 값을 제한함 --> 오버플로우 방지
            // Ex. 961을 1234567891로 나눈 나머지는 961

            hash = (hash + (alphabet * term) % M) % M; // 해시 값 계산
        }

        System.out.println(hash);
    }
}
