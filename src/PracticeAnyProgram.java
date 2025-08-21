import java.util.*;

public class PracticeAnyProgram {
    public static void main(String[] args) {

   String str="persistent";

   char[] chArray=str.toCharArray();

        LinkedHashSet<Character> duplicate=new LinkedHashSet<>();
        LinkedHashSet<Character> unique=new LinkedHashSet<>();

        for (char ch:chArray){
            if (!unique.add(ch)){
                duplicate.add(ch);
            }
        }
        System.out.println(unique);
        unique.removeAll(duplicate);
        System.out.println(unique);






    }
}














