package Programs;

public class ListOfPrimeNumbers {
    public static void main(String[] args) {
        int num=2,num1=50;

        for (int i=num;i<=num1;i++){
            boolean value=true;
            for (int j=2;j<=i/2;j++){
                if(i%j==0){
                    value=false;
                }
            }
            if(value){
                System.out.println(i);
            }
        }
    }
}
