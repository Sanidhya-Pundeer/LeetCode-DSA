public class Try1 {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3 };
        try {
            System.out.println(ar[5]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("sdfghjk");
        }
    }
}
