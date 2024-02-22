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