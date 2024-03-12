import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[8];

		// 배열에 넣고
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		boolean ascending = true;
		boolean descending = true;

		for (int i = 0; i < 7; i++) {
			if (arr[i] < arr[i + 1]) {
				descending = false; // 뒤의 요소가 더 크면 내림차순 false
			} else if (arr[i] > arr[i + 1]) {
				ascending = false; // 앞의 요소가 더 크면 오름차순 false
			}
		}

		if (ascending) {
			System.out.println("ascending");
		} else if (descending) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}