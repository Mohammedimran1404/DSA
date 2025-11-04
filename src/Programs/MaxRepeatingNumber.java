package Programs;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatingNumber {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 1, 5,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num :array){
            int value=map.getOrDefault(num,0);
            map.put(num,value+1);
        }
        int maxCount=0;
        int maxNum=array[0];

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                maxNum= entry.getKey();

            }
        }
        System.out.println("MaxCount "+maxCount+" "+"MaxValue "+maxNum);
    }
}

