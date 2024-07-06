public class palindrome {
    public static void main(String[] args) {
        int a = 121;
        int temp = a;
        int tem = a;
        long ans = 0;
        int size = 0;
        while (tem > 0) {
            tem = tem / 10;
            size++;
        }
        while (temp > 0) {
            int r = temp % 10;
            temp = temp / 10;
            ans += r * Math.pow(10, size - 1);
            size--;

        }
        if (ans == a) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }

    }
}
