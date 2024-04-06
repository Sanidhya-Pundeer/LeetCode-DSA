public class binaryStrings {
    public static void main(String[] args) {
        String a = "100";
        String b = "110";
        String c = "";
        String carry = "";
        for (int i = a.length(); i > 0; i--) {
            for (int j = b.length(); j > 0; j--) {
                if (a.charAt(i) == 0 && b.charAt(j) == 0) {
                    c = "0" + c;
                } else if ((a.charAt(i) == 1 && b.charAt(j) == 0) || (a.charAt(i) == 0 && b.charAt(j) == 1)) {
                    c = "1" + c;
                } else if ((a.charAt(i) == 1 && b.charAt(j) == 1)) {

                }
            }
        }

    }
}
