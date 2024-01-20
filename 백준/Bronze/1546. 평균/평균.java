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

        int[] arr = new int[N]; // 현재 성적 배열에 담기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0]; // 최댓값 초기화

        // 최댓값 찾기
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double newGrade = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            newGrade = (double)arr[i]/max*100;
            sum += newGrade;
        }
        
        double avg = sum / N;

        System.out.println(avg);
    }
}