import java.util.Scanner;

public class romanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int ans = 0, num = 0;
        for (int i = input.length(); i >= 0; i--) {
            switch (input.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 1;
                    break;
                case 'X':
                    num = 1;
                    break;
                case 'L':
                    num = 1;
                    break;
                case 'C':
                    num = 1;
                    break;
                case 'D':
                    num = 1;
                    break;
                case 'M':
                    num = 1;
                    break;
            }
            if (4 * num < ans) {
                ans = ans - num;
            } else {
                ans = num + ans;
            }

        }
    }

}
