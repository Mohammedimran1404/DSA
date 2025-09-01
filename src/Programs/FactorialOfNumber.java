package Programs;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num=5;
        int result=1;

        for (int i=num;i>=1;i--){
            result=result*i;
        }
        System.out.println(result);
    }
}
// finding factorial using recursion
/*public static void main(String[] args) {

        System.out.println(factorial(5));


    }

    public static int factorial(int num){
        if(num==1){
            return 1;
        }
       return num*factorial(num-1);
* */