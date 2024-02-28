import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();

        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (alphabets[ch - 'a'] == -1) { // 돌다가 같은 알파벳을 만났을 때 갱신되어 저장되지 않도록
                alphabets[ch - 'a'] = i;
            }
        }

        for (int num : alphabets) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}
