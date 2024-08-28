import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class zad29 {

    public static boolean isValidParentheses(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != '}' && c != ')' && c != ']') {
                stack.push(c);
            } else if (!stack.isEmpty()) {

                if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isValidParentheses(input));
        }

    }
}
