package Arrays;

import java.util.Arrays;

public class MinArray {
    public static void main(String[] args) {


        int array[] = {5, 6, 2, 8, 2, 4, 1, 9};

        int minArray = array[0];

        for (int i = 1; i <array.length;i++){
            if(array[i]<minArray){
                minArray=array[i];
            }
        }
        System.out.println(minArray);
    }
}