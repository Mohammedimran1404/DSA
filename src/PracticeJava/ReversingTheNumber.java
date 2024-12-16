package PracticeJava;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReversingTheNumber {
    public static void main(String[] args) {

        int number=1234;
        String str=number+"";
//       StringBuilder stringBuilder=new StringBuilder();
       String string=new String();

        char[] ch=str.toCharArray();
       for (int i=ch.length-1;i>=0;i--){
           string=string.concat(String.valueOf(ch[i]));
//           stringBuilder.append(ch[i]);
       }
       int convertedNumber=Integer.parseInt(string.toString());
        System.out.println(convertedNumber);



    }

}

