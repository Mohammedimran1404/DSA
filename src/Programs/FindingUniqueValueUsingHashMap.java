package Programs;

import java.util.HashMap;
import java.util.Map;

public class FindingUniqueValueUsingHashMap {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            int value = map.getOrDefault(num, 0);
            map.put(num, value + 1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }

    }
}

