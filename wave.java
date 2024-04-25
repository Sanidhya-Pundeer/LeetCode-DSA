import java.util.Arrays;

public class wave {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 4, 10, 5, 20, 3 };
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
