package arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

    public boolean verify(String s1, String s2) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        s1.chars().forEach(c -> {
            if(map1.containsKey(c)) {
                map1.put((char) c, (map1.get(c)+1));
            } else {
                map1.put((char) c, 1);
            }
        });

        s2.chars().forEach(c -> {
            if(map2.containsKey(c)) {
                map2.put((char) c, (map2.get(c)+1));
            } else {
                map2.put((char) c, 1);
            }
        });

        return map1.entrySet().equals(map2.entrySet()) && map1.keySet().equals(map2.keySet());
    }
}
