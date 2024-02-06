import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 2차원 배열
        int[][] graph = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            graph[i][0] = Integer.parseInt(st.nextToken());
            graph[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(graph, new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int result = o1[0] - o2[0]; // 첫번째 인덱스 기준으로 오름차순

                if (result == 0) { // 첫번째 요소가 같다면
                    result = o1[1] - o2[1]; // 두번째 인덱스 기준으로 오름차순
                }
                
                return result;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(graph[i][0] + " " + graph[i][1]);
        }
    }
}