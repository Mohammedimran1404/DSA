package Programs;

import java.util.HashSet;

public class ComparingTwoStringsChar {
    public static void main(String[] args) {
//        String str="abcd";
//        String str1="bxyzd";

        String str="apple";
        String str1="pineapple";

        HashSet<Character> set=new HashSet<>();
        HashSet<Character> common=new HashSet<>();

        for (char ch:str.toCharArray()){
            set.add(ch);
        }

        for (char ch:str1.toCharArray()){
            if(set.contains(ch)){
             common.add(ch);
            }
        }
        System.out.println(common);

    }
}
