import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
		long a = scan.nextLong();
        long b = scan.nextLong();
        
        if (a < b) {
            System.out.println((b * (b + 1)) / 2 - (a * (a - 1)) / 2);
        } else if (b < a) {
            System.out.println((a * (a + 1)) / 2 - (b * (b - 1)) / 2);
        } else {
            System.out.println(a);
        }
    }
}