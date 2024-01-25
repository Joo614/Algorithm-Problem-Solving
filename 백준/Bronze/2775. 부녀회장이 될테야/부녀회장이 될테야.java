import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

        // k층 n 호 에는 사람이 (k-1)층 1호 + (k-1)층 2호 + .. + (k-1)층 n호 까지 더한 수의 사람이 존재
        // 2차원 배열을 사용해서
        // arr[k][n] 을 구하려면 --> arr[k][n-1] + arr[k-1][n] 을 하면 됨

        int[][] arr = new int[15][15];

        for (int i = 0; i < 15; i++) {
            arr[i][1] = 1; // i층 1호 --> 각 층 1호의 사람 수는 1명씩
            arr[0][i] = i; // 0층 i호 --> 0층 i호의 사람 수는 i호에 i명
        }

        for (int i = 1; i < 15; i++) { // 1층 - 14층
            for (int j = 2; j < 15; j++) { // 2호 - 14호
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n] + "\n"); // 사람 수 출력
        }

        System.out.println(sb);
    }
}