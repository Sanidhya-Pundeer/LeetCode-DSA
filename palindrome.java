public class palindrome {
    public static void main(String[] args) {
        String s = "0P";
        // String trimmed = s.replace(" ", "").replace(",", "").replace(".",
        // "").replace(":", "").toLowerCase();
        String trimmed = s.replace(" ", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = trimmed.length() - 1;
        System.out.println(trimmed);

        char[] arr = trimmed.toCharArray();

        if (arr.length == 0) {
            System.out.println("palindrome");
        } else {
            boolean flag = true;
            while (start < end) {
                if (arr[start] == arr[end]) {
                    flag = true;

                } else {
                    flag = false;
                    break;
                }
                start++;
                end--;
            }

            if (flag == true) {
                System.out.println("palindrome");
            } else {
                System.out.println("not a palindrome");
            }

        }

    }
}
