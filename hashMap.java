import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // unordered maps just like hashsets

        // insertion
        map.put("india", "high");
        map.put("us", "low");

        // print
        System.out.println(map);

        // value updated
        map.put("us", "high");
        System.out.println(map);

        // serach operation
        if (map.containsKey("france")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // for checking value
        if (map.containsValue("mid")) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        // to get value from key
        System.out.println(map.get("us"));

        // to get value from key, key does not exist
        System.out.println(map.get("america"));

        // new for loop
        // int[] arr = { 10, 1, 2, 5, 4 };
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // traversing in hashMap - making set of entire entries of hashmap
        for (Map.Entry<String, String> i : map.entrySet()) {
            System.out.println(i);// print the entire hashMap
            System.out.println(i.getValue());// to print the value of the entire hashMap
        }

        System.out.println("printing only keys");
        // set of keys of entire hashmap
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // removing from hashmap
        map.remove("us");
        System.out.println(map);

        // get size of map
        System.out.println(map.size());
    }
}
