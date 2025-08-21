package Programs;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=6;
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for (int i=2;i<num;i++){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.print(" "+b);
        }

    }
}
