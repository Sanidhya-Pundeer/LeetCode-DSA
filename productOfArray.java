import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
        float arr[] = new float[] {};
        int n = arr.length;
        float result[] = new float[n];
        float temp = 1;
        for (int i = 0; i < n; i++) {
            temp = temp * arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[i] = temp / arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
