import java.util.Arrays;

public class jump {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 0, 0 };
        int i = 0;
        int len = nums.length;
        int pos = 0;
        int temp = 0;
        boolean flag = true;
        while (i < len - 1 && flag == true) {
            pos = nums[i];
            if (pos == temp) {
                flag = false;
            }
            temp = pos;
            i = pos + i;

        }

        if (i >= nums.length - 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
