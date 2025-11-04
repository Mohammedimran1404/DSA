package Programs;

import java.util.HashMap;
import java.util.Map;

public class FindingDistinctArraySum {
    public static void main(String[] args) {
        int[] array={10,20,30,10,20,40};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:array){
            int value=map.getOrDefault(num,0);
            map.put(num,value+1);
        }
        int sum=0;
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getValue()==1){
                    sum+= entry.getKey();
                }
            }
        System.out.println(sum);
    }
}
/**
 *  HashMap<Integer,Integer>map=new HashMap<>();
 *
 *       for(int num:array){
 *          int value=map.getOrDefault(num,0);
 *          map.put(num,value+1);
 *       }
 *       int sum=0;
 *       for(Map.Entry<Integer,Integer>entry:map.entrySet()){
 *          if(entry.getValue()==1){
 *             sum+= entry.getKey();
 *          }
 *       }
 *       System.out.println(sum);
 */