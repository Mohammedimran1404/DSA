package Programs;

import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
        int[] array={1,2,3};
        int[] array1={4,5,6};
        int[] mergeArray=new int[array.length+array1.length];

        for(int i=0;i<array.length;i++){
            mergeArray[i]=array[i];
        }
        for(int j=0;j<array1.length;j++){
            mergeArray[array.length+j]=array1[j];
        }
        System.out.println(Arrays.toString(mergeArray));



    }
}
