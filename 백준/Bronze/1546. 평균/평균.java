import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 시험 본 과목의 개수

        st = new StringTokenizer(br.readLine(), " "); // 현재 성적

        // 현재 성적 배열에 담기 + 최댓값 찾기
        int[] arr = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 새 점수 환산 후 합계 구하기
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            double newGrade = (double) arr[i]/max*100;
            sum += newGrade;
        }

        // 평균 구하기
        double avg = sum / N;

        System.out.println(avg);
    }
}
