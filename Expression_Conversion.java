import java.util.Stack;
import java.util.EmptyStackException;

public class Expression_Conversion {

    public static String prefixToInfix(String expression) {
    Stack<String> s = new Stack<>();
    for (int i = expression.length() - 1; i >= 0; i--) {
        char c = expression.charAt(i);

        if (Character.isLetter(c)) {
            s.push(Character.toString(c));
        } else {
            if (s.size() < 2) {
                throw new EmptyStackException();
            }
            String operand1 = s.pop();
            String operand2 = s.pop();
            String operator = Character.toString(c);

            String result = "(" + operand1 + operator + operand2 + ")";
            s.push(result);
        }
    }

    if (!s.isEmpty()) {
        return s.pop();
    } else {
        return ""; 
    }
}


    // Method to convert postfix to prefix
    public static String postfixToPrefix(String expression) {
    Stack<String> s = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
        char c = expression.charAt(i);

        if (Character.isLetter(c)) {
            s.push(Character.toString(c));
        } 
        else {
            if (s.size() < 2) {
                throw new RuntimeException("Invalid Postfix Expression: Not enough operands.");
            }

            String operand2 = s.pop();
            String operand1 = s.pop();

            String result = c + operand1 + operand2;

            s.push(result);
        }
    }

    if (s.size() != 1) {
        throw new RuntimeException("Invalid Postfix Expression: Remaining elements in stack.");
    }

    return s.pop();  
}


    public static void main(String[] args) {
        String expression = "ABC+*D/";  
        String expression1 = "+A*BC";
        String postToPre = postfixToPrefix(expression);
        String preToInfix = prefixToInfix(expression1);
        System.out.println(preToInfix);
        System.out.println(postToPre); 
    }
}
