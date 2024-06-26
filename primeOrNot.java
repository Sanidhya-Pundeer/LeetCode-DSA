import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for lower and upper limits
        System.out.println("Enter the lower limit:");
        int lower = scanner.nextInt();
        System.out.println("Enter the upper limit:");
        int upper = scanner.nextInt();

        for (int i = lower; i <= upper; i++) {
            int count = 0;
            // try to divied i and increase count
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;

                    break;

                }
            }
            if (count == 0) {

                System.out.println(i);
            }

        }

        // for (int i = lower; i <= upper; i++) {
        // boolean isPrime = true;

        // // Check if i is divisible by any number from 2 to sqrt(i)
        // for (int j = 2; j * j <= i; j++) {
        // if (i % j == 0) {
        // isPrime = false;
        // break;
        // }
        // }

        // // If it's prime, print it
        // if (isPrime) {
        // System.out.println(i);
        // }
        // }
        scanner.close();
    }
}
