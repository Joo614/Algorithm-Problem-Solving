import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int R = Integer.parseInt(st.nextToken()); // 반복 횟수
			String S = st.nextToken(); // 문자열
            
            StringBuilder sb = new StringBuilder();

			for (char ch : S.toCharArray()) {
				for (int i = 0; i < R; i++) {
					sb.append(ch);
				}
			}
            
            System.out.println(sb);
		}
	}
}
