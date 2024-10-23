import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacters {
    public static Set<Character> findRepeatedChars(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        Set<Character> repeated = new HashSet<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                repeated.add(c);
            }
        }

        return repeated;
    }

    public static void main(String[] args) {
        System.out.println(findRepeatedChars("programming")); 
        System.out.println(findRepeatedChars("hello"));        
    }
}
