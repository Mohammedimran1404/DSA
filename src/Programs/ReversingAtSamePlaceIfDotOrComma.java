package Programs;

public class ReversingAtSamePlaceIfDotOrComma {
    public static void main(String[] args) {

        double d=123.41;
        String ConString=String.valueOf(d);
        String[] strArray=ConString.split("\\.");
        StringBuilder builder=new StringBuilder();

        for (int k=0;k<strArray.length;k++){
            int i=0;
            int j=strArray[k].length()-1;
            char[] chArray=strArray[k].toCharArray();

            while (i<j){
                char ch=chArray[i];
                chArray[i]=chArray[j];
                chArray[j]=ch;
                i++;
                j--;
            }
            builder.append(new String(chArray));
            if (k<strArray.length-1){
                builder.append(".");
            }
        }
        System.out.println(Float.parseFloat(builder.toString()));

    }

}
