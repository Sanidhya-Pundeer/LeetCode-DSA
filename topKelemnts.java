import java.util.*;

public class topKelemnts {
    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 2, 3 };

        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        int result[];

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) { // understand for loop
            list.add(new ArrayList<>());
        }

        for (Integer i : map.keySet()) {
            List<Integer> sub_list = list.get(map.get(i)); // understand this loop
            sub_list.add(i);
        }

        for (int i = list.size(); i >= 0; i--) {

        }
    }
}
