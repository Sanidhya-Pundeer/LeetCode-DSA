public class GreaterArray {
    public static void main(String[] args) {
        int[] ar = { 9, 6, 10, 1 };
        int count = 0;
        int i = 0;
        while (i < ar.length) {
            if (i == 0) {
                if (ar[i] > ar[i + 1]) {
                    count++;
                }
            } else if (i == ar.length - 1) {
                if (ar[i] > ar[i - 1]) {
                    count++;
                }
            } else {
                if (ar[i] > ar[i + 1] && ar[i] > ar[i - 1]) {
                    count++;
                }
            }
            i++;
        }
        System.out.println(count);

    }
}
