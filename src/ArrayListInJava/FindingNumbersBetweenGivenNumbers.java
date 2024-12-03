package ArrayListInJava;

import java.util.ArrayList;

public class FindingNumbersBetweenGivenNumbers {

    public static void main(String[] args) {

        int startNumber=3,endNumber=6;
        ArrayList<Integer> data=new ArrayList<>();

        int[] array ={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<array.length;i++){
            if(array[i]>=startNumber&&array[i]<=endNumber){
              data.add(array[i]);
            }
        }
        System.out.println("numbers in between "+startNumber+" to "+endNumber+" are "+data);

        /** storing the elements in array instead of arraylist
         count is used to store the length which avoid the remaining values which is not required
         *
          */


        int[] storeArray =new int[array.length];
        int count=0;
        for (int i=0;i<array.length;i++){
            if(array[i]>=startNumber&&array[i]<=endNumber){
                storeArray[count]=array[i];
                count++;
            }
        }
        System.out.println(count);
        for (int i=0;i<count;i++) {
            System.out.print(storeArray[i]+" ");
        }


    }


}
