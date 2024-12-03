package LinearSearchAlgorithm;

public class FindCharInString {

    public static void main(String[] args) {

        String strName="Imran";
        char ch='a';
            boolean value=false;
        for (int i=0;i<strName.length();i++){
            if(strName.charAt(i)==ch){
                value=true;
            }
        }
        System.out.println(value);
    }
}
