package LinearSearchAlgorithm;

public class ReversingTheNumber {
    public static void main(String[] args) {

        int num=1234;

        String strConvNum=String.valueOf(num);

        String convNum="";

        for (int i = strConvNum.length()-1; i >=0 ; i--) {

            convNum=convNum+strConvNum.charAt(i);
        }
        System.out.println("Reverse num is "+Integer.valueOf(convNum));
    }
}
