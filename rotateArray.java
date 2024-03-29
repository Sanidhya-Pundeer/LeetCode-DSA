import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {

        int k = 3;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        int n = nums.length;
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            int j = (i + k) % n;
            arr1[j] = nums[i];
        }
        nums = arr1;
        System.out.println(Arrays.toString(nums));

    }
}
