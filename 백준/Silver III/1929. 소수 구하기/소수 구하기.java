import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        // 소수 판별 배열 N까지 나타내기 위해 범위는 N+1로
        boolean[] isPrime = new boolean[N + 1];


        // 0과 1은 소수 X
        isPrime[0] = false;
        isPrime[1] = false;
        
        // 배열 초기화 --> 일단 모든 수를 소수라고 함
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= N; i++) {

            if (isPrime[i]) { // true일 때
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false; // 소수의 배수들 == 소수가 아님 --> false 로 바꿈
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if(isPrime[i])
                sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}