import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int num = sc.nextInt();

        int temp = 0;
        int newNum = 0;
        int count = 0;

        int dupNum = num;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        // System.out.println(count);

        for (int i = 1; i <= count; i++) {
            int pwr = (int) Math.pow(10, count - i);
            // System.out.println(pwr);
            temp = dupNum % 10;
            // System.out.println(temp);

            dupNum = dupNum / 10;
            // System.out.println("duplicate num:" + dupNum);
            newNum = newNum + temp * pwr;
            // System.out.println("new num: " + newNum);
        }
        System.out.println(newNum);

        sc.close();
    }
}
