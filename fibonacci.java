import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series: ");
        int end = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < end; i++) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;

        }
        sc.close();
    }
}
