package PracticeJava;

public class FibonacciNumbers {

    public static void main(String[] args) {

        int num=4;
        int a=0;
        int b=1;
        int temp=0;
        for(int i=2;i<=num;i++){

            temp=b;
            b=a+b;
            a=temp;

        }
        System.out.println(b);

    }
}
