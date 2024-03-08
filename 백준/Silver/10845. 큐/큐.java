import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int lastNum = 0;

		Queue<Integer> q = new LinkedList<>();
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			if (order.contains("push")) {
				lastNum = Integer.parseInt(st.nextToken());
				q.add(lastNum);
			}

			if (order.contains("pop")) {
				int num = q.isEmpty() ? -1 : q.poll();
				sb.append(num).append("\n");
			}

			if (order.contains("size")) {
				int num = q.size();
				sb.append(num).append("\n");
			}

			if (order.contains("empty")) {
				int num = q.isEmpty() ? 1 : 0;
				sb.append(num).append("\n");
			}

			if (order.contains("front")) {
				int num = q.isEmpty() ? -1 : q.peek();
				sb.append(num).append("\n");
			}

			if (order.contains("back")) {
				int num = q.isEmpty() ? -1 : lastNum;
				sb.append(num).append("\n");
			}
		}

		System.out.println(sb);
	}
}