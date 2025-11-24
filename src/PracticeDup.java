import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
public class PracticeDup {
    public static void main(String[] args) {


        String str = "malayalam dad";
        StringBuilder reverse=new StringBuilder();
        String[] strSplit=str.split(" ");
        for(String word:strSplit){
            for(int i=word.length()-1;i>=0;i--){
                reverse.append(word.charAt(i));
            }
            System.out.println("No");
        }


    }
    }







