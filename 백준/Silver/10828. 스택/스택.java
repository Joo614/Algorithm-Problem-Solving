import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			if (order.contains("push")) {
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
			}

			if (order.contains("pop")) {
				int num = stack.isEmpty() ? -1 : stack.pop();
				sb.append(num).append("\n");
			}

			if (order.contains("size")) {
				int num = stack.size();
				sb.append(num).append("\n");
			}

			if (order.contains("empty")) {
				int num = stack.isEmpty() ? 1 : 0;
				sb.append(num).append("\n");
			}

			if (order.contains("top")) {
				int num = stack.isEmpty() ? -1 : stack.peek();
				sb.append(num).append("\n");
			}
		}

		System.out.println(sb);
	}
}