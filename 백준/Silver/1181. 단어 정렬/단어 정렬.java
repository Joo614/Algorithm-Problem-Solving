import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 단어의 개수

        String[] arr = new String[N];
        Set<String> set = new HashSet<>(); // 중복 제거를 위한 Set

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            arr[i] = word;
            set.add(word);
        }

        // Set을 배열로 변환하여 길이 기준으로 정렬
        String[] uniqueWords = set.toArray(new String[0]);
        Arrays.sort(uniqueWords, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        // 정렬된 결과를 StringBuilder에 추가
        for (String word : uniqueWords) {
            sb.append(word).append("\n");
        }

        System.out.println(sb);
    }
}