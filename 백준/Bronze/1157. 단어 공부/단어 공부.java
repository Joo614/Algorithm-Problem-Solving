import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase(); // 대문자로 변환한 단어

        int[] count = new int[26]; // 알파벳 개수만큼의 배열 생성

        // 쭉 돌다가 해당 알파벳이 있으면 배열에서 해당 알파벳에 해당하는 인덱스에 1씩 증가시킬거임
        for (int i = 0; i < word.length(); i++) {
            int numIndex = word.charAt(i) - 'A'; // Ex. i인덱스의 알파벳이 A 이면 A(65) - A(65) == 0 이기 때문에 0번째 인덱스에 숫자 ++
            count[numIndex]++;
        }

        int max = 0;
        char answer = '?';

        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = (char) (i + 'A'); // 인덱스인 i에 65 더해주고 char로 변경하면 대문자 나옴
            } else if (max == count[i]) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}