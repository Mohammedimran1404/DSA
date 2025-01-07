package PracticePrograms;

public class SumOfIntValue {
    public static void main(String[] args) {
        int number=1234;
        int sum=0;
        while(number>0){
            int lasDigit=number%10;
            sum=sum+lasDigit;
            number=number/10;
        }
        System.out.println("the total count of a number is "+sum);
    }
}
