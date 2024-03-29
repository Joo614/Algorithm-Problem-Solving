import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 첫째 줄 읽어옴

        int N = Integer.parseInt(st.nextToken()); // 카드의 개수
        int M = Integer.parseInt(st.nextToken()); // 세 수의 최대 합

        // 둘째 줄 읽어와서 배열에 담기
        st = new StringTokenizer(br.readLine(), " "); // 둘째 줄 읽어옴 ( 카드들 )
	
	int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

         for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (result < sum && sum <= M) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
