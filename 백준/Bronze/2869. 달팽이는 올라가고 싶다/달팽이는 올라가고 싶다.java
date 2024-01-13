import java.util.Scanner;

public class Main {
// 높이 Vm
// 낮 +Am / 밤 -Bm
// Vm에 도달하면 안미끄러짐

// V % (A-B) == 0 이라면 count -> v / (A-B)
// V % (A-B) != 0 라면
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);

        long A = scan.nextLong();
        long B = scan.nextLong();
        long V = scan.nextLong();

        if (V == A) {
            System.out.println(1);
        } else if ((V-A) % (A-B) == 0) {
            long count = (V-A) / (A-B) + 1;
            System.out.println(count);
        } else {
            long count = (V-A) / (A-B) + 2;
            System.out.println(count);
        }
    }
}