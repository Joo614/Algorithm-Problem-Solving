import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		long staticCost = Long.parseLong(st.nextToken()); // 고정비용
		long changeCost = Long.parseLong(st.nextToken()); // 가변비용
		long laptopCost = Long.parseLong(st.nextToken()); // 노트북 가격

        if (laptopCost - changeCost <= 0) {
			System.out.println(-1);
			return;
		}

		long volume = staticCost / (laptopCost - changeCost) +1;
		
		System.out.println(volume);
	}
}