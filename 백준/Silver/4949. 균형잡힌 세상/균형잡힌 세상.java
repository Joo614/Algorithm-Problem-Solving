import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String str = br.readLine();

            if(str.equals("."))
                break;
            
            else
                System.out.println(solve(str));
        }
    }

    public static String solve(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            }
            
            else if (ch == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                else 
                    stack.pop();
            }
            
            else if (ch == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else 
                    stack.pop();
            }
        }

        if (stack.isEmpty())
            return "yes";
        else
            return "no";
    }
}