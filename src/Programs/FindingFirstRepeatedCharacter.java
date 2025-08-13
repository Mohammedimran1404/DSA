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
