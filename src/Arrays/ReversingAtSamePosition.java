package Arrays;


public class ReversingAtSamePosition {
    public static void main(String[] args) {
       String strName="Apple Ball";

       String[] splitted=strName.split(" ");
       
      String str="";
       for(String words:splitted) {
           String strReversed = "";
           for (int i = words.length() - 1; i >= 0; i--) {
               strReversed += words.charAt(i);

           }
          str= str.concat(strReversed).concat(" ");
       }
        System.out.println(str);

    }
}
