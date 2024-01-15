import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 벌집 개수는 1 -> 6 -> 12 -> 18 -> 24 이렇게 첫번째를 제외하고 6씩 늘어남
// 1 -> 벌집 개수 count 1
// 2-7 -> count 2
// 8-19 -> count 3
// 20-37 -> count 4
// 이런 식으로 n이 어디 그룹에 속해있는지 확인 후
// 해당 그룹 수 +1 하기 (1이 있는 그룹 포함해야하니까)

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1; // 최소 루트
        int num = 2; // 수

        if (N == 1) {
            System.out.println(count);
        }
        else {
            while (num <= N) { // 2부터 N이 될 때 까지
                num += 6 * count; // 수는 처음에 2였다가 -> 8 -> 20 이런 식으로 증가
                count++; // 한 벌집 구역마다 카운트
            }
            System.out.println(count);
        }
    }
}
