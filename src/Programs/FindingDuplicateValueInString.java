package Programs;

import java.util.HashSet;

public class FindingDuplicateValueInString {
    public static void main(String[] args) {

            String str = "abcaefbaa";
        char[] chArray = str.toCharArray();
        HashSet<Character> unique = new HashSet<>();
        StringBuffer duplicate = new StringBuffer();

        for (char ch : chArray) {
            if (!unique.add(ch)) {
                duplicate.append(ch);
            }
        }
        if (duplicate.isEmpty()) {
            System.out.println("Unique String");
        } else {
            System.out.println(duplicate);
        }

    }
}