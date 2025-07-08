package PracticePrograms;

public class FactorialOfNumber {
    public static void main(String[] args) {

        int number=5;
        int result=1;

        for (int i=number;i>=1;i--){
            result=result*i;
        }
        System.out.println("Factorial of number is "+result);
    }
}
