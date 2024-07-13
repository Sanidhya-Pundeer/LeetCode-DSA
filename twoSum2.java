public class twoSum2 {
    public static void main(String[] args) {

        int[] numbers = { 5, 25, 75 };
        int i = 0;
        int j = numbers.length - 1;
        int target = 100;
        int diff = 0;
        int index1 = 0;
        int index2 = 0;
        int first = 0;
        boolean flag = true;

        while (i <= numbers.length - 1 && flag == true) {
            int temp = j;
            first = numbers[i];
            diff = target - first;
            temp = j;
            while (temp >= i) {
                if (diff == numbers[temp]) {
                    index1 = i;
                    index2 = temp;
                    temp = -1;
                    flag = false;
                } else {
                    temp--;
                }
            }
            i++;

        }
        index1 = index1 + 1;
        index2 = index2 + 1;

        System.out.println(index1);
        System.out.println(index2);

        // faster methods are there
    }
}
