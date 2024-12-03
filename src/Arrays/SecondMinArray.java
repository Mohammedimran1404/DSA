package Arrays;

import java.util.Arrays;

public class SecondMinArray {
    public static void main(String[] args) {
        int array[]={5,4,2,6,1,9};

       Arrays.sort(array);
        int minArray=array[0];

        for (int i = 1; i <array.length ; i++) {

            if(array[i]<minArray){
                minArray=array[i+1];
            }

        }
        System.out.println(minArray);
    }
}
