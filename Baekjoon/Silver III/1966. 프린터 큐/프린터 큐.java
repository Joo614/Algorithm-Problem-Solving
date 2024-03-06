import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        while (T-- > 0) { // 테스트 케이스 개수만큼 반복

            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");

            LinkedList<int[]> q = new LinkedList<>();
            // 큐는 인터페이스이기 때문에 직접적으로 인스턴스화될 수 없어서 뒤에는 구현 클래스로 정의해주어야 함
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken()); // 중요도
                q.offer(new int[]{i, priority}); // 인덱스, 중요도
            }

            int count = 0;
            while (true) {
                int[] num = q.poll(); // 처음 수 뺌
                boolean isMax = true; // firstNum의 원소가 가장 큰 원소인지를 판단

                for (int i = 0; i < q.size(); i++) {
                    if (num[1] < q.get(i)[1]) { // 처음 뽑은 원소보다 큐에 있는 i번째 원소의 중요도가 클 경우

                        q.offer(num); // 뽑은 요소 뒤로 넣음
                        for (int j = 0; j < i; j++) { // i번째 전의 요소들은 모두 빼서 뒤에 다시 넣음
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                // 처음 요소가 가능 큰 요소가 아니었으므로 다음 반복문으로 넘어감
                if (isMax == false) {
                    continue;
                }

                // 처음 요소가 가장 큰 요소였으므로 해당 요소는 출력해야할 문서임
                count++;
                if (num[0] == M) {
                    break;
                }
            }
            System.out.println(count);

        }
    }
}

------- 다른 풀이 -------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        while (T-- > 0) { // 테스트 케이스 개수만큼 반복

            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken()); // 문서 개수
            int M = Integer.parseInt(st.nextToken()); // 궁금한 문서

            st = new StringTokenizer(br.readLine(), " ");

            LinkedList<int[]> q = new LinkedList<>();
            
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken()); // 중요도
                q.offer(new int[]{i, priority}); // 인덱스, 중요도
            }

            int count = 0;
            while (true) {
                int[] document = q.poll();
                boolean isMax = true; // 처음 뺀 문서 document 의 중요도가 가장 큰지를 판단

                // 현재 분서보다 중요도가 더 높은 문서가 있는지 확인하는 부분
                for (int i = 0; i < q.size(); i++) {
                    if (document[1] < q.get(i)[1]) {
                        
                        q.offer(document);
                        for (int j = 0; j < i; j++) { 
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }

                count++;
                if (document[0] == M) {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
