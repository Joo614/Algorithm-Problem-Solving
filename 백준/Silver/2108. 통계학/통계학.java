import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int sum = 0; // 합계
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            list.add(num);
        }

        // 중앙값을 찾기 위해 정렬
        Collections.sort(list);

        // 산술 평균 계산
        double ave = (double) sum / N;

        // 중앙값 계산
        int median = list.get(N / 2);

        // 최빈값 계산
        HashMap<Integer, Integer> frequencyMap = new HashMap<>(); // 빈도수를 저장할 map
        int maxFrequency = 0; // 가장 높은 빈도수
        int mode = 0; // 최빈값

        for (int num : list) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            } else if (frequency == maxFrequency && num < mode) {
                mode = num;
            }
        }

        // 최빈값 리스트 생성
        List<Integer> modeList = new ArrayList<>();
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == maxFrequency) {
                modeList.add(num);
            }
        }

        // 최빈값 리스트 정렬 후 두 번째 값을 선택
        if (modeList.size() > 1) {
            Collections.sort(modeList);
            mode = modeList.get(1);
        }

        // 범위 계산
        int range = list.get(N - 1) - list.get(0);

        System.out.println(Math.round(ave)); // 1. 산술 평균
        System.out.println(median); // 2. 중앙값 // list 요소는 0부터 시작 / 수로 따지자면 N/2+1 번째의 수를 가져와야하는데 인덱스니까 N/2만
        System.out.println(mode); // 3. 최빈값
        System.out.println(range); // 4. 범위
    }
}