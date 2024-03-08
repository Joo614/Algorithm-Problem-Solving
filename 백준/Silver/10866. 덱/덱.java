import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		Deque<Integer> q = new ArrayDeque<>();
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			if (order.contains("push_front")) {
				int num = Integer.parseInt(st.nextToken());
				q.addFirst(num);
			}
			else if (order.contains("push_back")) {
				int num = Integer.parseInt(st.nextToken());
				q.addLast(num);
			}
			else if (order.contains("pop_front")) {
				int num = q.isEmpty() ? -1 : q.pollFirst();
				sb.append(num).append("\n");
			}

			else if (order.contains("pop_back")) {
				int num = q.isEmpty() ? -1 : q.pollLast();
				sb.append(num).append("\n");
			}

			else if (order.contains("size")) {
				int num = q.size();
				sb.append(num).append("\n");
			}

			else if (order.contains("empty")) {
				int num = q.isEmpty() ? 1 : 0;
				sb.append(num).append("\n");
			}

			else if (order.contains("front")) {
				int num = q.isEmpty() ? -1 : q.peekFirst();
				sb.append(num).append("\n");
			}

			else if (order.contains("back")) {
				int num = q.isEmpty() ? -1 : q.peekLast();
				sb.append(num).append("\n");
			}
		}

		System.out.println(sb);
	}
}