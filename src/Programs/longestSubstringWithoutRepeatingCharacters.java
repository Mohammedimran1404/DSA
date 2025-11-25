package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "imran";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int start = 0, maxLength = 0, startIndex = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // If character already exists, move start pointer
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }

            // store/update latest index of character
            map.put(c, end);
            System.out.println(map);
            // update max length
            if ((end - start + 1) > maxLength) {
                maxLength = end - start + 1;
                startIndex = start;
            }
        }

        String longest = s.substring(startIndex, startIndex + maxLength);
        System.out.println("Longest Substring Without Repeating Characters: " + longest);
    }
}
