import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int maxA = makeMax(a);
		int minA = makeMin(a);
		int maxB = makeMax(b);
		int minB = makeMin(b);

		int max = maxA + maxB;
		int min = minA + minB;
		
		System.out.println(min + " " + max);
	}

	public static int makeMax(int num) {
		String stringNum = Integer.toString(num);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < stringNum.length(); i++) {
			char cha = stringNum.charAt(i);

			if (cha == '5') {
				sb.append('6');
			} else {
				sb.append(cha);
			}
		}

		return Integer.parseInt(sb.toString());
	}

	public static int makeMin(int num) {
		String stringNum = Integer.toString(num);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < stringNum.length(); i++) {
			char cha = stringNum.charAt(i);

			if (cha == '6') {
				sb.append('5');
			} else {
				sb.append(cha);
			}
		}

		return Integer.parseInt(sb.toString());
	}
}