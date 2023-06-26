// 가우스 덧셈 공식
// n<m일 때, n부터 m까지의 정수를 모두 더한 값은
// (n+m) * (m-n+1) / 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
		long a = scan.nextLong();
        long b = scan.nextLong();
        
        if (a < b) {
            //System.out.println((b * (b + 1)) / 2 - (a * (a - 1)) / 2);
            System.out.println((a+b) * (b-a+1) / 2);
        } else if (b < a) {
            //System.out.println((a * (a + 1)) / 2 - (b * (b - 1)) / 2);
            System.out.println((a+b) * (a-b+1) / 2);
        } else {
            System.out.println(a);
        }
    }
}