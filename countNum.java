import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to count digits of: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
