package PracticePrograms;

public class ReverseStringAtSamePositionWithStringClass {
    public static void main(String[] args) {

        String strString="Apple Ball";
        String[] strSplitted=strString.split(" ");
        String strStore = "";

        for (String strSingle:strSplitted){
            String strReversed="";
            for (int i=strSingle.length()-1;i>=0;i--){
                strReversed=strReversed+strSingle.charAt(i);
            }
            strStore=strStore.concat(strReversed).concat(" ");
        }
        System.out.println(strStore.trim());
    }

}
