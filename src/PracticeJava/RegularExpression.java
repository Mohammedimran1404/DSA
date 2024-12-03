package PracticeJava;

public class RegularExpression {
    public static void main(String[] args) {
        String input="123453 * imran";

       String[]s= input.split("\\*");

       for(String sa:s){
           System.out.println(sa);

       }



    }
}
