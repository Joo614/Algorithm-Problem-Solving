import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int start = 0; // 스택에 넣은 위치를 저장하기 위함

        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if (num > start) { // start +1부터 입력받은 num 까지 push
                for (int i = start + 1; i <= num; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }

                start = num; // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            else if (stack.peek() != num) { // 맨 위에 있는 원소가 입력받은 값과 같지 않은 경우
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}
