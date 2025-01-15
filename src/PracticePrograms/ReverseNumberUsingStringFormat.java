package PracticePrograms;

public class ReverseNumberUsingStringFormat {
    public static void main(String[] args) {
        int number = 1234;

        String strNumber = String.valueOf(number);
        String strConvertedNumber="";

        for (int i=strNumber.length()-1;i>=0;i--){
            strConvertedNumber+=strNumber.charAt(i);
        }
        System.out.println(Integer.parseInt(strConvertedNumber));
    }
}
