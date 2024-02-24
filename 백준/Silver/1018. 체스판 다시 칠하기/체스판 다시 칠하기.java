import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] board;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    board[i][j] = true; // 흰색
                } else {
                    board[i][j] = false; // 검은색
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i, j);
            }
        }

        System.out.println(min);

    }

    public static void find(int x, int y) {

        // 현재 위치에서 8x8 크기의 체스판이 끝나는 지점
        int end_x = x + 8;
        int end_y = y + 8;

        int count = 0; // 현재 체스판에서 변경해야할 색의 개수

        boolean TF = board[x][y]; // 첫번째 칸의 색 // true

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (board[i][j] != TF) { // 올바른 색이 아닐 경우 count 증가
                    count++;
                }

                TF = !TF; // 다음 칸은 색이 바뀌므로 값 바꿔주기
            }
            TF = !TF;
        }

        count = Math.min(count, 64 - count);
        // 첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
        // 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의 색칠 할 개수(64 - count)
        // 중 최솟값을 count 에 저장

        min = Math.min(min, count);
        // 이전까지의 경우 중 최솟값보다 현재 count 값이 더 작을 경우 최솟값 갱신
    }
}