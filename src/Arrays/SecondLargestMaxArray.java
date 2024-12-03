package Arrays;

import java.util.Arrays;

public class SecondLargestMaxArray {
    public static void main(String[] args) {

        int array[]={4,5,7,1,2,3,9};

        Arrays.sort(array);
        int maxArray=array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]>maxArray){
                maxArray=array[i-1];
            }
        }
        System.out.println(maxArray);


    }
}
