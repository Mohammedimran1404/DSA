package Programs;

import java.util.LinkedHashSet;

public class FindingFirstRepeatedCharacter {
    public static void main(String[] args) {
        String str="abcba";

        LinkedHashSet<Character> unique=new LinkedHashSet<>();
        LinkedHashSet<Character>duplicate=new LinkedHashSet<>();

        for(char ch:str.toCharArray()){
            if(!unique.add(ch)){
                duplicate.add(ch);
                break;
            }
        }
        for (char ch:duplicate) {
            System.out.println(ch);
        }
    }
}

/**
 * second repeated character
 * String str = "abajabd";
 *
 *       HashSet<Character> unique = new HashSet<>();
 *       HashSet<Character> common = new HashSet<>();
 *
 *       for (char ch : str.toCharArray()) {
 *          if (!unique.add(ch)) {
 *             common.add(ch);
 *
 *          }
 *
 *       }
 *       int count = 0;
 *       for (char ch : str.toCharArray()) {
 *          if (common.contains(ch)) {
 *             count++;
 *
 *             if (count == 2) {
 *                System.out.println(ch);
 *                break;
 *             }
 *          }
 *       }
 */
