import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 사람 수
        int K = Integer.parseInt(st.nextToken()); // 몇번째 사람 뺄지
        

        List<Integer> people = new ArrayList<>(); // 사람들

        for (int i = 1; i <= N; i++) { // 1번부터 N번 사람까지 추가
            people.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int removalIndex = 0; // 제거될 사람의 인덱스

        while (N > 1) { // 마지막 요소 하나 남을 때 까지
            // K번째 요소를 제거하려면 배열은 0부터 인덱스 시작이기 때문에 K-1번째 제거해야함
            // Ex. 7, 3 이라면
            removalIndex = (removalIndex + (K - 1)) % N; // 1. 2 % 7 == 2 // 2. (2+(3-1)) % 7 == 4
            sb.append(people.remove(removalIndex)).append(", "); // 1. 2번째 인덱스(3) 가져와서 제거 후 print // 2. 4번째 인덱스(6) 가져와서 제거 후 print

            N--;
        }

        sb.append(people.remove(0)).append(">");
        System.out.println(sb);
    }
}