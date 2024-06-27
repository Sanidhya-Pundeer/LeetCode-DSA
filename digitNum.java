import java.util.Scanner;

public class digitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int dupNum = num;
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        // System.out.println("count: " + count);

        int temp = 0;

        for (int i = 1; i <= count; i++) {
            int pwr = (int) Math.pow(10, count - i);
            // System.out.println("10: " + pwr);
            temp = dupNum / pwr;
            // System.out.println("temp:" + temp);
            dupNum = dupNum - temp * pwr;
            System.out.println(temp);
        }

        sc.close();
    }
}
