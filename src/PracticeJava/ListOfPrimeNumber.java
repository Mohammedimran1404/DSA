package PracticeJava;

public class ListOfPrimeNumber {
    public static void main(String[] args) {

        int maxNumber=100;

        for (int i=2;i<=maxNumber;i++){
            int count=0;
            for (int j=1;j<=i;j++) {
                if (i % j == 0) {
                    count++;
                }
            }
                if(count==2){
                    System.out.println(i);
                }

        }
    }
}
