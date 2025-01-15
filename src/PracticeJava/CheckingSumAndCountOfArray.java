package PracticeJava;

public class CheckingSumAndCountOfArray {
    public static void main(String[] args) {

       int[] array={111130,4567,345,32};


       for (int i=0;i<array.length;i++){
           int sum=0;
           int count=0;
           int number=array[i];
           while (number>0){
               count++;
               int lastDigit=number%10;
               sum=sum+lastDigit;
               number=number/10;
           }
          if (sum%2==0&&count%2==0){
              System.out.println("The sum is "+sum+" and the count is "+count+ " Classic Even number");
          }
       }

    }
}
