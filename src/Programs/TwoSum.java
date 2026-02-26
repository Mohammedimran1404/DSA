package Programs;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        // Approach 1

        int[] array = {2, 7, 11, 15};
         int target = 18;

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<array.length;i++){
           int result=target-array[i];
           if(map.containsKey(result)){
               System.out.println("indexes "+ map.get(result)+" "+i);
               System.out.println(result+" "+array[i]);
               break;
           }
           map.put(array[i],i);
        }


        // Approach 2
//        int[] array = {2, 7, 11, 15};
//        int target = 18;
//
//        for(int i=0;i<array.length;i++){
//            for(int j=i+1;j<array.length;j++){
//                if(array[i]+array[j]==target){
//                    System.out.println("Pair "+array[i]+" + "+array[j]+" = "+ target);
//                }
//            }
//        }
    }
}
