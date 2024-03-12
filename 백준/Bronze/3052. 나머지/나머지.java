import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 10;
		HashSet<Integer> set = new HashSet<>();
		
		while (T-- > 0) {
			int num = Integer.parseInt(br.readLine());

			int rest = num % 42;

			set.add(rest);
		}
		
		System.out.println(set.size());
	}
}