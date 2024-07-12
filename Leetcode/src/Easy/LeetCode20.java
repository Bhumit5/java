package Easy;
import java.util.Stack;

public class LeetCode20 {

    public static void main(String[] args) {
        System.out.println(isValid("({()}){[]}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else {
                if (stack.size() == 0) {
                    return false;
                }

                ch = stack.pop();
                if (!((curr == ')' && ch == '(') || (curr == '}' && ch == '{') || (curr == ']' && ch == '['))) {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
