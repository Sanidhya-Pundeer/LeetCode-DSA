public class containsDuplicate {
    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 3 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("true");
                }
            }
            System.out.println("false");
        }
    }
}
