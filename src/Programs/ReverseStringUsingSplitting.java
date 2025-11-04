package Programs;

public class ReverseStringUsingSplitting {
    public static void main(String[] args) {

        String str="kairos tech";
        String[] splitString=str.split(" ");
        for (String singleString:splitString){
            char[] charArray = singleString.toCharArray();
            int i=0;
            int j=singleString.length()-1;
            while(i<j){
                char temp=charArray[i];
                charArray[i]=charArray[j];
                charArray[j]=temp;
                i++;
                j--;
            }
            System.out.print(new String(charArray));
            System.out.print(" ");
        }
    }
}
