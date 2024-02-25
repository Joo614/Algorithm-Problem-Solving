import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int roundedN = (int)Math.round(N * 0.15);
        int sum = 0;
        for (int i = roundedN; i < N - roundedN; i++) {
            sum += arr[i];
        }

        int ave = (int) Math.round( (double) sum / (N - 2 * roundedN));

        System.out.println(ave);
    }
}