package Programs;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "care";

        if(str1.length()!=str2.length()){
            System.out.println("length is different not an anagram");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            int value = map.getOrDefault(ch, 0);
            map.put(ch, value+1);
        }
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("not an anagram");
                return;
            }
            int i = map.get(ch) - 1;
            map.put(ch, i);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        if (map.isEmpty()){
            System.out.println("Anagram");
        }
        else {
            System.out.println("not an anagram");
        }

    }
}


//        String str1 = "race";
//        String str2 = "care";
//
//        char[] a1 = str1.toCharArray();
//        char[] a2 = str2.toCharArray();
//
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//
//        if (Arrays.equals(a1, a2)) {
//            System.out.println("Anagram");
//        } else {
//            System.out.println("Not Anagram");
//        }
//    }
//
//}
