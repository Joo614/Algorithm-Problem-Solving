import java.util.Scanner;
// 높이 Vm
// 낮 +Am / 밤 -Bm
// Vm에 도달하면 안미끄러짐
// (V-A) % (A-B) == 0 이라면 count -> (V-A) / (A-B) + 1
// (V-A) % (A-B) != 0 라면 count -> (V-A) / (A-B) + 2

public class Main {
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
