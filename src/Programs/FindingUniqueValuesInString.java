package Programs;

import java.util.LinkedHashSet;

public class FindingUniqueValuesInString {
    public static void main(String[] args) {
        String str="abcdab";

        LinkedHashSet<Character> unique=new LinkedHashSet<>();
        LinkedHashSet<Character> duplicate=new LinkedHashSet<>();

        for(char ch:str.toCharArray()){
            if(!unique.add(ch)){
                duplicate.add(ch);
            }
        }
        unique.removeAll(duplicate);

        System.out.println(unique);
    }
}
