package Solutions;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // ([])

        for (char ch : s.toCharArray()) { // (,[, ]
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // (,[
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop(); // Get the top element from stack // [

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) { // t && f ,

                    return false; // Invalid case
                }
            }
        }

        // If stack is empty, all brackets are matched properly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        System.out.println(solution.isValid("()")); // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]")); // false
        System.out.println(solution.isValid("([])")); // true
        System.out.println(solution.isValid("{[()]}")); // true
        System.out.println(solution.isValid("([)]")); // false
    }
}