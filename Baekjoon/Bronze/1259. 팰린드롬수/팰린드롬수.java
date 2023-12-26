import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) { // 무한루프
            String num = br.readLine(); // 숫자 입력 받기

            StringBuilder sb = new StringBuilder(num);
            String reverseNum = sb.reverse().toString(); // 여기서 sb는 StringBuilder 타입이라서 toString()

            if(num.equals("0")) break; // 입력 마지막 줄에 0이 주어지니까 --> 그럼 무한루프 탈출

            if (num.equals(reverseNum)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
