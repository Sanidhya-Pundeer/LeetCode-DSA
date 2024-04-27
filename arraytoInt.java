import java.util.*;

class arraytoInt {
    public static void main(String[] args) {

        String sample = "1119";
        char arr[] = sample.toCharArray();
        int ten = 0;
        int ans = 1;
        for (int i = 0; i < arr.length - 1; i++) {

            int temp = (int) arr[i] - 48;

            for (int j = 0; j < arr.length - 1; j++) {
                ans = (int) (temp * Math.pow(10, ten));
            }
        }
        System.out.println(ans);
    }
}