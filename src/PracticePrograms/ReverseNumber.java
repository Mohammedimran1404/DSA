package PracticePrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=1234;
        int reverseNumber=0;

        while(number>0){
            int lastDigit=number%10;
            reverseNumber=reverseNumber*10+lastDigit;
            number=number/10;

        }
        System.out.println("Reverse Number is "+reverseNumber);
    }


}
