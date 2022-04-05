package challenges;
import java.util.Stack;

public class CurlyBraces {

    public static void main(String[] args) {

        String string = "({})";

        Stack<Character> stack = new Stack<>();

        char[] stringAsCharArray = string.toCharArray();

        for(char c : stringAsCharArray) {
            if(c == ' ') {
                continue;
            }

            if(c == '(' || c =='{' || c == '[') {
                stack.push(c);
            } else if (c ==')' && stack.peek() == '('
                        || (c == '}' && stack.peek() == '{')
                        || (c == ']' && stack.peek() == '[')) {
                stack.pop();
            }
        }
        System.out.println(stack);

        if(stack.isEmpty() == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
