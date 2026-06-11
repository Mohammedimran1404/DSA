package Programs;

import java.util.Arrays;

public class MovingZerosToFront {
    public static void main(String[] args) {
        int[] array={1,0,3,0,5,7};
        int index=array.length - 1;

        for(int i=array.length-1;i>=0;i--){
            if(array[i]!=0){
                array[index]=array[i];
                index--;
            }
        }
        while(index>=0){
            array[index]=0;
            index--;
        }
        System.out.println(Arrays.toString(array));
    }
}
