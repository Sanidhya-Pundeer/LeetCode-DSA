import java.util.Scanner;

public class lengthLastWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String arr[] = s.split(" ");
        int x = arr.length - 1;

        String arr1 = arr[x];

        int y = arr1.length();
        System.out.println(y);

        sc.close();
    }
}
