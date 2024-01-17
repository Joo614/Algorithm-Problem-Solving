import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine(); // N 은 쓰지 않음

		int count = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백 기준으로 끊어줌

		while (st.hasMoreTokens()) { // 토큰이 없을 때까지
			int num = Integer.parseInt(st.nextToken());
			
			if (isPrime(num)) {
				count++;
			}
		}
		System.out.println(count);
	}

	// 소수 확인 부분 메서드로 분리
	public static boolean isPrime(int num) {
		if (num == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}
}
