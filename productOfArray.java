import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int product = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                left[0] = 1;
            } else {
                left[i] = product;
                product = product * arr[i];
            }

        }
        product = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                right[n - 1] = 1;
                product = product * arr[n - 1];
            } else {
                right[i] = product;
                product = product * arr[i];
            }
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for (int i = 0; i < n; i++) {
            arr[i] = left[i] * right[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}