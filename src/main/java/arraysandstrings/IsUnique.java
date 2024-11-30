package arraysandstrings;

import java.util.HashSet;
import java.util.Set;

/**
 * Time is O(n)
 */
public class IsUnique {

    public boolean verify(String s) {

        Set<Character> characterSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(characterSet.contains(c)) return false;
            characterSet.add(c);
        }
        return true;
    }

}
