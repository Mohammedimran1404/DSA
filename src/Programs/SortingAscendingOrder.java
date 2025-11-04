package Programs;

import java.util.Arrays;

public class SortingAscendingOrder {
    public static void main(String[] args) {

        int[] array={5,4,3,2,1};

        for (int i=0;i<array.length-1;i++){
           for (int j=0;j<array.length-1;j++){
               if(array[j]>array[j+1]){
                   int temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
               }
           }

        }
        System.out.println(Arrays.toString(array));
    }
}
