package JAVAEASYEG;


import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {
    public static void main(String[] args) {
        String input = "aaaaafghijklmnopqrstuvwxyz";

        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " Count: " + entry.getValue());
        }
    }
}
