import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;

public class test {
    public static void main(String[] args) {
        // System.out.println(Integer.SIZE / 8);
        // System.out.println(Double.SIZE / 8);
        // System.out.println(Byte.SIZE / 8);
        // System.out.println(Character.SIZE / 8);
        // System.out.println(Long.SIZE / 8);
        // System.out.println(Float.SIZE / 8);
        // System.out.println(Short.SIZE / 8 + "sanidhya " + Short.MAX_VALUE);

        // System.out.println("Speed:" + (3 * Math.pow(10, 8) * (60 * 60 * 24 * 5 + 5 *
        // 60 * 60)));

        // for (int i = 97; i < 123; i++) {
        // System.out.println((char) i);
        // }

        // int i = 99_9_8; // JAVA discards underscore
        // System.out.println(i);

        // Dynamic initialization: value returned from function isn't known by the
        // compiler, thus its dynamically initialized.
        // Data Truncation: values are truncated on the basis of the size of datatype we
        // have.
        // e.g. int => byte (truncate bytes)

        try {
            // int[] ar = { 1, 2, 3, };
            // System.out.println(ar[3]);
            // System.out.println('c');
            File f = new File("C:/Users/punde/OneDrive/Desktop/data/work/3rdyear/6thsem/LeetCode-DSA/d.txt");

            if (f.exists()) {
                System.out.println(f.getAbsolutePath());
            }

            // FileReader reader = new FileReader(f);
            // System.out.println(reader.read());
            // reader.close();
            System.out.println("uiji");

        } catch (Exception e) {
            System.out.println("ypjoo");
        }
        System.out.println('u');

        System.out.println(5 | 7); // Bitwise Or
        System.out.println(5 & 7); // Bitwise And

        System.out.println(5 ^ 7); // Bitwise XOR
        System.out.println("array conversion");
        int b = 1;
        String a = Integer.toString(b);
        System.out.println(a);
        char arr[] = a.toCharArray();
        if (arr[0] == '1') {
            arr[0] = '0';
        } else {
            arr[0] = '1';
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
