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

        // 수가 0부터 N까지 시작하기 때문에 크기가 N + 1
        boolean[] isPrime = new boolean[N + 1];

        // 배열 초기화 --> 일단 소수가 아닌 0,1은 제외하고 2부터 모든 수를 소수라고 함
        // 어차피 배열은 false로 초기화되어있기 때문에 0,1은 따로 false 처리 해주지 않아도 됨
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= N; i++) { // i의 배수를 소수가 아닌 것으로 판단할거니까
            // Ex. N이 20이면, i가 2일 때부터 4, 9, 16까지만 검사하게 됨
            // --> 4보다 큰 i의 배수는 이미 이전에 다른 i에 의해 false로 바뀌었기 때문에 아래 if문 조건에 맞지 않아 다음 반복으로 넘어감

            if (isPrime[i]) { // true일 때
                for (int j = i * i; j <= N; j += i) { // i의 배수를 걸러내는 역할
                    // Ex. i == 2면 4부터 +2씩 하면서 2의 배수를 모두 false로 만듦 / 더하다가 i <= N이 되면 종료하고 다시 밖에 for문으로 감
                    isPrime[j] = false;
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
