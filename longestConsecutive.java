import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutive {
    public static void main(String[] args) {
        int nums[] = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        if (nums.length == 0) {
            System.out.println("0");
        }

        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // Start of a new sequence
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        System.out.println(longestStreak);

    }
}
