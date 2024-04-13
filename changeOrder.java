public class changeOrder {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 0, 3, 1, 8, 0, 5 };
        int n = arr.length;
        int[] newarr = new int[n];
        for (int i = 0; i < n; i++) {

            if (arr[i] == '0') {
                newarr[0] = arr[i];
            }

        }

        int x = 10;
        x = x++;
        System.out.println(x);
    }
}
