import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class topKelemnts {
    public static void main(String[] args) {
        int nums[] = { 3, 0, 1, 0 };
        // HashMap approach

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[] sample = new int[2];
        System.out.println(Arrays.toString(sample));

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        // Arrays.sort(nums);
        // int k = 1;

        // int temp = 0;

        // int curr_count = 0;
        // int prev_count = 0;
        // int x = 0;
        // int i = 0;
        // int j = 1;

        // int arr[] = new int[k];

        // int number = 0;

        // if (nums.length == 1) {
        // System.out.println(nums);
        // } else {
        // while (x <= nums.length - 1) {

        // if (nums[x] == number) {
        // x++;
        // } else {
        // number = nums[x];

        // int m = 0;

        // if (k == 1) {
        // while (m <= nums.length - 1) {
        // if (nums[m] == number) {
        // curr_count++;
        // }
        // m++;
        // }

        // if (curr_count > prev_count) {
        // arr[i] = number;
        // }

        // prev_count = curr_count;
        // curr_count = 0;
        // x++;

        // } else {

        // while (m <= nums.length - 1) {
        // if (nums[m] == number) {
        // curr_count++;
        // }
        // m++;
        // }

        // if (curr_count > prev_count) {
        // arr[j] = arr[i];
        // arr[i] = number;

        // } else if (arr[j] == 0 && curr_count <= prev_count) {
        // arr[j] = number;
        // } else {

        // }
        // i++;
        // j++;
        // if (j > arr.length - 1) {
        // j = arr.length - 1;
        // i = j - 1;
        // }

        // prev_count = curr_count;

        // curr_count = 0;
        // x++;
        // }
        // }
        // }
        // }

        // System.out.println(Arrays.toString(arr));
    }
}
