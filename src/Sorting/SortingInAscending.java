package Sorting;

import java.util.Arrays;

public class SortingInAscending {
    public static void main(String[] args) {

        int[] array={5,4,3,2,1};

        for (int i=0;i<array.length-1;i++){
            boolean value=false;
            for (int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    value=true;
                }
            }
            /*
             * if the loop is in a sorted order it
             * will iterate for first outer loop iteration after it will break it won't
             * go for next iteration, it will save time.
             */
            if(!value){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
