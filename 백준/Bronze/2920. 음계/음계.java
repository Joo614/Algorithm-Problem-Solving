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

		int[] originalArr = new int[8];
		int[] sortedArr = new int[8];
		Integer[] reverseSortedArr = new Integer[8];

		// 세 배열에 모두 넣어주고
		for (int i = 0; i < 8; i++) {
			int num = Integer.parseInt(st.nextToken());
			originalArr[i] = num;
			sortedArr[i] = num;
			reverseSortedArr[i] = num;
		}

		Arrays.sort(sortedArr);
		Arrays.sort(reverseSortedArr, Comparator.reverseOrder());
		int[] reversSortedArr = Arrays.stream(reverseSortedArr)
			.mapToInt(Integer::intValue)
			.toArray();

		Boolean ascending = Arrays.equals(originalArr, sortedArr);
		Boolean descending = Arrays.equals(originalArr, reversSortedArr);
		
		if (ascending) {
			System.out.println("ascending");
		} else if (descending) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}