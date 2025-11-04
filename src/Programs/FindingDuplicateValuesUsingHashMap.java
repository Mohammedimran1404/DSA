package Programs;

import java.util.HashMap;
import java.util.Map;

public class FindingDuplicateValuesUsingHashMap {
    public static void main(String[] args) {

        int[] array={1,2,3,4,3,1};

        HashMap<Integer, Integer> map=new HashMap<>();

        for (int num:array){
            int value=map.getOrDefault(num,0);
            map.put(num,value+1);
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                /* (entry.getValue()-1) used when to print 1 value instead of 2 */
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
