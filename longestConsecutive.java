import java.util.*;

public class longestConsecutive {
    public static void main(String[] args) {
        int nums[] = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        int longest = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            set.add(nums[1]);
        }

        // Iterator<Integer> it = set.iterator();

        int temp = 0;
        int variable = 0;

        if (nums.length == 0) {
            longest = 0;
        } else {
            for (int num : set) {
                if (!set.contains(num - 1)) {
                    variable = num;
                    temp = 1;
                }

                while (set.contains(variable + 1)) {
                    variable = variable + 1;
                    temp = temp + 1;
                }
                longest = Math.max(temp, longest);
            }
        }

    }
}
