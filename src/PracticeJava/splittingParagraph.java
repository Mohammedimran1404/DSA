package PracticeJava;

public class splittingParagraph {
    public static void main(String[] args) {

      String strParagraph="My name is imran. i am 24 years old. i am test engineer in Kairos technologies";
        String strParagraph1 = "My name is imran. i am 24 years old. i am test engineer in Kairos technologies";
        String strNew = "";
        for (int i = 0; i < strParagraph1.length(); i++) {
            if (strParagraph1.charAt(i) == '.') {
                strNew += " -";

            } else {
                strNew += strParagraph1.charAt(i);
                System.out.println(strNew.hashCode());
            }
        }
        System.out.println(strNew);



     String strArray[]=strParagraph.split("\\.");
     for(String strNew1:strArray){
         System.out.println(strNew1.strip());
         }

      }

    }





