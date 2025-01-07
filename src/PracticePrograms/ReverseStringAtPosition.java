package PracticePrograms;


public class ReverseStringAtPosition {
    public static void main(String[] args) {

        String str = "Apple Ball";
        String[] strArray = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String strSingle : strArray) {
            for (int i = strSingle.length() - 1; i >= 0; i--) {
                stringBuilder.append(strSingle.charAt(i));
            }
            stringBuilder.append(" ");
        }
        System.out.println(String.valueOf(stringBuilder).trim());
    }
}
