import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        HashMap<Integer, Integer> mapN = new HashMap<>();
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            mapN.put(num, mapN.getOrDefault(num, 0) + 1);
            // key 값에 수 - value 값에 몇번 등장하는지
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (mapN.containsKey(num)) {
                int value = mapN.get(num);
                sb.append(value).append(" ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}