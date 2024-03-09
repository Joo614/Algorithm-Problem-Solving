import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이분 탐색의 Upper Bound 사용
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[] arr = new int[K];
		long max = 0; // 만들 수 있는 최대 길이

		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if (max < arr[i]) {
				max = arr[i];
			}
		}

		max++;

		long min = 0;
		long mid = 0;

		while (min < max) {
			mid = (max + min) / 2;

			long count = 0;

			for (int i = 0; i < arr.length; i++) {
				count += arr[i] / mid;
			}

			if (count < N) {
				max = mid;
			}
			else {
				min = mid +1;
			}
		}

		System.out.println(min - 1);
	}
}