package Programs;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueFromTwoString {
    public static void main(String[] args) {
        String str="abcd";
        String str1="bxyzd";

        String strCombine=str+str1;
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:strCombine.toCharArray()){
            int value=map.getOrDefault(ch,0);
            map.put(ch,value+1);
        }

        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
