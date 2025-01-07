package PracticeJava;

import PracticePrograms.SecondLargestArray;

public class SecondMinimumArray {
    public static void main(String[] args) {

        int[]array={1,2,3,5,4,9,8,8,9};
        int minNumber=Integer.MAX_VALUE;
        int secondMinNumber=Integer.MAX_VALUE;
        System.out.println(secondMinNumber);
        for (int number:array){
            if(number<minNumber){
                secondMinNumber=minNumber;
                minNumber=number;
            } else if (number<secondMinNumber&&number!=minNumber) {
                secondMinNumber=number;
            }
        }
        System.out.println(secondMinNumber);
        System.out.println(minNumber);

       

    }
}
