package Programs;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int num=7;
        boolean value=true;
        for (int i=2;i<=num/2;i++){
            if(num%i==0){
               value=false;
            }
        }
        if(value){
            System.out.println(num+" is a prime number");
        }
        else {
            System.out.println("not a prime");
        }
    }
}
