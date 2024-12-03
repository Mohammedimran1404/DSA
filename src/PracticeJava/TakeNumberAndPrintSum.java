package PracticeJava;

import java.util.Scanner;

public class TakeNumberAndPrintSum {

    public static void main(String[] args) {
        TakeNumberAndPrintSum takeNumberAndPrintSum=new TakeNumberAndPrintSum();
        takeNumberAndPrintSum.sumOfNumbers();


    }

    public void sumOfNumbers(){

            int num1 = getScannerClass();
            int num2 = getScannerClass();
            getSum(num1, num2);

    }

    public int getScannerClass(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        return scanner.nextInt();
    }

    public int getSum(int num1,int num2){
        int sum= num1+num2;
        System.out.println("addition of two number is : "+sum);
        return sum;

    }

}
