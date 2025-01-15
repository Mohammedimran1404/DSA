package PracticeJava;

public class ListOfPrimeNumber {
    public static void main(String[] args) {
        int minNumber=2;
        int maxNumber=100;
        System.out.print("The Prime numbers from " +minNumber+ " to "+maxNumber+" are :");
        for (int i=minNumber;i<=maxNumber;i++){
            int count=0;
            for (int j=1;j<=i;j++) {
                if (i % j == 0) {
                    count++;
                }
            }
                if(count==2){
                    System.out.print(" "+i);

                }

        }
    }
}
