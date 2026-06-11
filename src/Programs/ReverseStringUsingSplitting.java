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

// another way of doing
/**
 * double d=123.41;
 *         String convString=String.valueOf(d);
 *         String[] strArray=convString.split("\\.");
 *         StringBuilder rev=new StringBuilder();
 *         for(int j=0;j<strArray.length;j++){
 *             for(int i=strArray[j].length()-1;i>=0;i--){
 *                 rev.append(strArray[j].charAt(i));
 *             }
 *             if(j<strArray.length-1){
 *                 rev.append(".");
 *             }
 *         }
 *         System.out.println(rev);
 */
