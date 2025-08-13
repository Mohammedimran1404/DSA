import java.util.HashSet;

public class PracticeDup {
    public static void main(String[] args) {

       String str="abcdab";

       char[] chArray=str.toCharArray();
       HashSet<Character> unique=new HashSet<>();
       HashSet<Character>duplicate=new HashSet<>();

       for (char ch:chArray){
           if(!unique.add(ch)){
               duplicate.add(ch);
           }
       }
        System.out.println(duplicate);





    }

    }

