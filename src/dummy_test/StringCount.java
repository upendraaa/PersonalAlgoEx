package dummy_test;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

    public static void main(String[] args) {

        String str = "My Name is Upendra My Name is Upendra";
        String[] strArray = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String data : strArray) {
            if (map.keySet().contains(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value  " + entry.getValue());
        }


    }
}
