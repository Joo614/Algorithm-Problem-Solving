import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // nCk = n! / ((n-k)! * k!)
        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    public static int factorial(int N) {
        if (N <= 1) { // 0! == 1! == 1
            return 1;
        }
        return N * factorial(N - 1);
    }
}
