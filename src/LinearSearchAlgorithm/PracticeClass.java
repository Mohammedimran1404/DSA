package LinearSearchAlgorithm;

public class PracticeClass {
    public static void main(String[] args) {

        String strName="Kairos Technologies";

        String[] strArray=strName.split(" ");
        String strNew="";
        for (String str:strArray){
            String strReversed="";
            for (int i=str.length()-1;i>=0;i--){
                strReversed=strReversed+str.charAt(i);
            }
            strNew=strNew.concat(strReversed).concat(" ");
        }
        System.out.println(strNew.trim());


            }
        }
