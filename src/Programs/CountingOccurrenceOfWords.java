package Programs;

import java.util.LinkedHashMap;

public class CountingOccurrenceOfWords {
    public static void main(String[] args) {
        String str="java is a language";
        String[] strArray=str.split(" ");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        for (String word:strArray){
            int value=map.getOrDefault(word,0);
            map.put(word,value+1);
        }
        System.out.println(map);

    }
}
