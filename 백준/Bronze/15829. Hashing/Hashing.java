import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;
        long pow = 1;

        int r = 31;
        long M = 1234567891;

        for (int i = 0; i < L; i++) {
            char ch = str.charAt(i);

            int alphabet = ch - 'a' + 1;

            sum += alphabet * pow % M;

            pow = pow * 31 % M;
        }
        long hash = sum % M;

        System.out.println(hash);
    }
}