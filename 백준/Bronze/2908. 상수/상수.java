import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int reversedA = reverse(A);
        int reversedB = reverse(B);

        System.out.println(Math.max(reversedA, reversedB));

    }

    public static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int num2 = num%10;
            reversedNum = reversedNum * 10 + num2;
            num /= 10;
        }
        return reversedNum;
    }
}