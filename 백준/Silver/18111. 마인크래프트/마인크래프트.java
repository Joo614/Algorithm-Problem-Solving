import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 세로
		int M = Integer.parseInt(st.nextToken()); // 가로
		int B = Integer.parseInt(st.nextToken()); // 인벤토리에 들어있는 블록 개수

		// 배열에 하나씩 넣어서 땅 일단 만들어
		int[][] ground = new int[N][M];
		int min = 256; // 얘를 최대로 해놔야 비교하면서 더 작은 값을 넣을 수 있음
		int max = 0; // 얘를 최소로 해놔야 비교하면서 더 큰 값을 넣을 수 있음

		// 쭉 돌면서 최솟값 - 최댓값을 찾아 --> 다 빼서 모두 최솟값이 되게 만들거나 / 다 추가해서 다 최댓값이 되게 하거나
		// 일단 최솟값부터 시작해서
		// H가 최솟값이라고 해
		// 그리고 쭉 배열 다 돌면서 H보다 작으면 H 될 때까지 추가하고 --> (H-h)만큼 시간을 소모 --> 근데 이거 추가한 거 개수 세서 B개 넘으면 다음 루프
		// H보다 크면 H 될 때까지 빼고 --> B에 추가해 --> (h-H)*2만큼 시간을 소모

		for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				ground[i][j] = Integer.parseInt(st.nextToken());

				if (min > ground[i][j])
					min = ground[i][j]; // 블럭의 최소 높이 구하기

				if (max < ground[i][j])
					max = ground[i][j]; // 블럭의 최대 높이 구하기
			}
		}

		int minTime = 99999999; // 땅을 고르게 할 수 있는 최소 시간 - 올 수 있는 값은 6400만정도로 예상 되기에 넉넉히 9999만을 저장
		int minHigh = 0; // 땅을 고르게 할 수 있는 최소 높이

		for (int h = min; h <= max; h++) { // 블럭의 높이(h)를 계속 올리면서 찾을 거임
			int time = 0; // 소모하는 시간
			int extraBlock = B; // 인벤토리에 있는 나머지 블럭

			// ground 좌표에서 값 비교하면서 찾기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {

					if (ground[i][j] > h) { // 현재 블럭의 높이가 기준 h 보다 높다면
						time += ((ground[i][j] - h) * 2); // 시간은 추가하고
						extraBlock += (ground[i][j] - h); // 블럭도 기준 h 만큼 뺄거니까 extra에 추가해
					} else { // 현재 블럭의 높이가 기준 h 보다 낮다면
						time += (h - ground[i][j]);
						extraBlock -= (h - ground[i][j]); // 기준 h 가 될 때까지 블럭을 빼서 추가해야함
					}
				}
			}

			if (extraBlock < 0) break;

			// 답이 여러개일 경우 그 중 땅의 높이가 가장 높은 것 출력
			if (minTime >= time) {
				minTime = time;
				minHigh = h;
			}
		}

		System.out.println(minTime + " " + minHigh);
	}
}