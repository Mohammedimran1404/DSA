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
