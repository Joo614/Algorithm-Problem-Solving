import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 쵀대공약수
        int greatest = 0;
        for (int i = 1; i <= a && i <= b; i++) {  // a,b 중 작은 값까지만 반복
            if (a % i == 0 && b % i == 0) {
                greatest = i;
            }
        }
        
        // 최소공배수
        int least = (a * b) / greatest;
        
        System.out.println(greatest);
        System.out.println(least);
    }
}

/////// 다른 풀이 ///////

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 쵀대공약수
        int greatest = euclidean(a, b);

        // 최소공배수
        int least = (a * b) / greatest;

        System.out.println(greatest);
        System.out.println(least);
    }

    public static int euclidean(int a, int b) { // 유클리드 호제법
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
