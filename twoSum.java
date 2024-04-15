import java.util.Arrays;

public class twoSum {
    public static int[] main(String[] args) {
        int arr[] = new int[] { 3, 3 };
        int total = 6;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int remain = total - arr[i];
                if (arr[j] == remain) {
                    index2 = j;
                    index1 = i;
                    break;
                }
            }

        }
        int sol[] = new int[2];
        sol[0] = index1;
        sol[1] = index2;

        System.out.println(Arrays.toString(sol));

        return sol;

    }
}
