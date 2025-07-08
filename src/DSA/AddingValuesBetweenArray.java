package DSA;

import java.util.Arrays;

public class AddingValuesBetweenArray {
    public static void main(String[] args) {
        int[] array=new int[6];
        int count=0;

        for (int i=100;i<=103;i++){
            array[count]=i;
            count++;
        }
        System.out.println(Arrays.toString(array));


        for (int i=count;i>0;i--){

            array[i]=array[i-1];
        }
        array[0]=99;
        count++;
        System.out.println(Arrays.toString(array));

        for (int i=count;i>2;i--){
            array[i]=array[i-1];
        }
        array[2]=456;


        System.out.println(Arrays.toString(array));



    }
}
