package Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String str="abcdefbfa";

        char[] charArray=str.toCharArray();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for (char ch:charArray){
            int value=map.getOrDefault(ch,0);
            map.put(ch,value+1);
        }

        char result='\0';
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            if (entry.getValue()==1){
                result=entry.getKey();
                break;
            }
        }
       if (result!='\0'){
           System.out.println(result);
       }
       else {
           System.out.println("All duplicates value");
       }






    }
}
