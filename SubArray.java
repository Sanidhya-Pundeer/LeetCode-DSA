public class SubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 4, 6, 9, 3 };
        int sum = 19;
        int i = 0, j = 0;
        int check = 0;
        while (j < arr.length - 1) {
            check += arr[j];
            if (j == arr.length - 1 && check != sum) {
                i++;
                j = i;
            }
            if (check == sum) {

            }
            j++;
        }
    }
}
