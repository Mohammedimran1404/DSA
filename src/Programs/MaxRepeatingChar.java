package Programs;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatingChar {
    public static void main(String[] args) {
        String str="abcaaba";
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:str.toCharArray()){
            int value=map.getOrDefault(ch,0);
            map.put(ch,value+1);
        }

        int maxCount=0;
        char maxCh=str.charAt(0);

        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount= entry.getValue();
                maxCh= entry.getKey();
            }
        }
        System.out.println(maxCount+" "+maxCh);
    }
}
