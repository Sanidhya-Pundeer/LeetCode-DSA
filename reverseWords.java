public class reverseWords {
    public static void main(String[] args) {
        String s = "hello world";
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i > 0) {
                ans.append(" ");
            }
        }

        // return ans.toString();
        System.out.println(ans.toString());
    }
}
