package HashMap;

import java.util.HashSet;

public class Methods {
    public static void main(String[] args) {
    String str="ABCA";
        HashSet<Character> hashSet=new HashSet<>();
        StringBuffer duplicate=new StringBuffer();

        for (char ch:str.toCharArray()) {
            if (!hashSet.add(ch)) {
                duplicate.append(ch);
            }
        }
        System.out.println(duplicate);


    }
}
