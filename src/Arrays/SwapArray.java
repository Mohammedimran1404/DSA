package Arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int array[]={1,2,3};
         int temp;

         temp=array[0];
         array[0]=array[2];
         array[2]=temp;

        for (int i = 0; i <array.length; i++) {

            System.out.println(array[i]);

        }

//        System.out.println(Arrays.toString(array));

    }
}
