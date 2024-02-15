import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        // 5로 나누어질 때까지 3으로 뺌
        // N을 3 이상으로 한 것은 --> 어차피 N이 2나 1이면 -1 출력해야하니까
        while (N > 0) {

            if (N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                return;
            } else if (N < 3) {
                System.out.println(-1);
                return;
            }

            N -= 3;
            count ++;
        }
        
        System.out.println(count);
    }
}