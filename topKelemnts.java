import java.util.Arrays;
import java.util.HashSet;

public class topKelemnts {
    public static void main(String[] args) {
        int nums[] = { 3, 0, 1, 0 };
        Arrays.sort(nums);
        int k = 1;

        int temp = 0;

        // for (int i = 0; i < nums.length - 1; i++) {
        // set.add(nums[1]);
        // }

        int curr_count = 0;
        int prev_count = 0;
        int x = 0;
        int i = 0;
        int j = 1;
        // int largest = 0;

        int arr[] = new int[k];

        int number = 0;

        if (nums.length == 1) {
            System.out.println(nums);
        } else {
            while (x <= nums.length - 1) {

                if (nums[x] == number) {
                    x++;
                } else {
                    number = nums[x];

                    int m = 0;

                    if (k == 1) {
                        while (m <= nums.length - 1) {
                            if (nums[m] == number) {
                                curr_count++;
                            }
                            m++;
                        }

                        if (curr_count > prev_count) {
                            arr[i] = number;
                        }

                        prev_count = curr_count;
                        curr_count = 0;
                        x++;

                    } else {

                        while (m <= nums.length - 1) {
                            if (nums[m] == number) {
                                curr_count++;
                            }
                            m++;
                        }

                        if (curr_count > prev_count) {
                            arr[j] = arr[i];
                            arr[i] = number;

                        } else if (arr[j] == 0 && curr_count <= prev_count) {
                            arr[j] = number;
                        } else {
                            // arr[j] = number;

                        }
                        i++;
                        j++;
                        if (j > arr.length - 1) {
                            j = arr.length - 1;
                            i = j - 1;
                        }

                        prev_count = curr_count;
                        // largest = curr_count;
                        curr_count = 0;
                        x++;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
