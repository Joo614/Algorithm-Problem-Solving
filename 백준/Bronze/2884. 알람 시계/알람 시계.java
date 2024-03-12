import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int H = Integer.parseInt(st.nextToken()); // 시
		int M = Integer.parseInt(st.nextToken()); // 분

		int rest = M - 45;

		if (rest < 0) {
			H--;
			if (H < 0) { // 시간이 음수가 되면
				H = 23;
			}
			M += 60; // 양수로 만든 다음
			M -= 45; // 45분 빼줘
		} else {
			M = rest;
		}
        
		sb.append(H).append(" ").append(M);
		System.out.println(sb);
	}
}