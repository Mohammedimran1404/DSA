package PracticePrograms;

public class CountingNumbersInInteger {
    public static void main(String[] args) {
        int number=1234;
        System.out.print(number+" has ");
        int count=0;
        while (number>0){
            count++;
            number=number/10;
        }
        System.out.println(count+" "+"count");
    }
}
