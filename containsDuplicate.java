import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] { 4, 5, 1, 3, 1 };
        Arrays.sort(nums);
        boolean flag = true;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                flag = true;
        }
        flag = false;
        System.out.println(flag);
    }
}
