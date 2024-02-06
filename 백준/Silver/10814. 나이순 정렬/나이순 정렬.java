import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 저지 회원 수

        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken(); // 나이
            arr[i][1] = st.nextToken(); // 이름
        }

        // 나이순 정렬
        Arrays.sort(arr, new Comparator<String[]>() { // 배열 arr 의 요소를 Comparator<String[]>에 의해 정의된 방식으로 정렬
            // 문자열 배열을 비교하여 정렬할 것이므로 Comparator<String[]> 사용
            @Override // 객체 정의를 위해 꼭 오버라이드
            public int compare(String[] s1, String[] s2) { // 두 요소 비교
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]); // 오름차순
            }
        });

        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] +" "+ arr[i][1]);
        }
    }
}
