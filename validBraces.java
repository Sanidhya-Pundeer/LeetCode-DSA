import java.util.Stack;

public class validBraces {
    public static void main(String[] args) {
        String a = "[{()}]";
        boolean flag = true;
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(' || a.charAt(i) == '[' || a.charAt(i) == '{') {
                s.push(a.charAt(i));
            }
            switch (a.charAt(i)) {
                case ')':
                    if (s.peek() == '(') {
                        s.pop();
                    } else {
                        flag = false;
                    }
                    break;

                case ']':
                    if (s.peek() == '[') {
                        s.pop();
                    } else {
                        flag = false;
                    }
                    break;
                case '}':
                    if (s.peek() == '{') {
                        s.pop();
                    } else {
                        flag = false;
                    }
                    break;
                default:
                    break;
            }
            if (flag == false) {
                break;
            }
        }
        if (s.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}
