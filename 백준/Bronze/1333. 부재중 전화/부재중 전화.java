import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());

		ArrayList<Boolean> arr = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < L; j++) {
				arr.add(true);
			}

			if (i != N) {
				for (int j = 0; j < 5; j++) {
					arr.add(false);
				}
			}
		}

		int result = 0;
		while (result < arr.size()) {
			if (arr.get(result) == false) {
				break;
			}
			result += D;
		}

		System.out.println(result);
	}
}