import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int n;
    static String list[];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            n = Integer.parseInt(br.readLine());
            
            // 0 받으면 입력 종료
            if (n == 0) break;
            
            // 초기화
            list = new String[n];
            
            // 입력 받기
            for (int i = 0; i < n; i++) {
                list[i] = br.readLine();
            }
            
            // 대소문자 구분 없이 정렬
            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
            
            System.out.println(list[0]);
        }
    }
}
