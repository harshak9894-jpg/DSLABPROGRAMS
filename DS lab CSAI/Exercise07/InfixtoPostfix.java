import java.util.*;

public class InfixtoPostfix {

    static int priority(char ch) {

        if (ch == '+' || ch == '-')
            return 1;

        if (ch == '*' || ch == '/')
            return 2;

        return 0;
    }

    static String infixToPostfix(String infix) {

        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);

            if (Character.isLetter(ch)) {

                postfix = postfix + ch;
            }

            else {

                while (!stack.isEmpty()
                        && priority(ch) <= priority(stack.peek())) {

                    postfix = postfix + stack.pop();
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {

            postfix = postfix + stack.pop();
        }

        return postfix;
    }

    static int evaluatePostfix(String postfix) {

        Stack<Integer> stack = new Stack<>();

        int A = 10;
        int B = 5;
        int C = 2;

        for (int i = 0; i < postfix.length(); i++) {

            char ch = postfix.charAt(i);

            if (ch == 'A')
                stack.push(A);

            else if (ch == 'B')
                stack.push(B);

            else if (ch == 'C')
                stack.push(C);

            else {

                int b = stack.pop();
                int a = stack.pop();

                if (ch == '+')
                    stack.push(a + b);

                else if (ch == '-')
                    stack.push(a - b);

                else if (ch == '*')
                    stack.push(a * b);

                else if (ch == '/')
                    stack.push(a / b);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String infix = "A+B*C";

        String postfix = infixToPostfix(infix);

        int result = evaluatePostfix(postfix);
        System.out.println("Infix Expression  : " + infix);
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("A = 10");
        System.out.println("B = 5");
        System.out.println("C = 2");
        System.out.println("Result      : " + result);
    }
}