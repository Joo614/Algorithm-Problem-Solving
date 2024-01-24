import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String num = br.readLine(); // 숫자 입력 받기

            StringBuilder sb = new StringBuilder(num);
            String reverseNum = sb.reverse().toString();

            if(num.equals("0")) break;

            if (num.equals(reverseNum)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}