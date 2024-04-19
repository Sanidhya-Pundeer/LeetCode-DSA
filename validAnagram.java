import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if (Arrays.equals(arr, arr1)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}