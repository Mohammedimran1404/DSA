package StringPrograms;

public class ConvertingLowerCaseToUpperCase {
    public static void main(String[] args) {

        String str="KaIrOS@123";
        StringBuffer buffer1=new StringBuffer();


        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z') {
                buffer1.append(Character.toLowerCase(ch));
            } else if (ch>='a'&&ch<='z') {
                buffer1.append(Character.toUpperCase(ch));
            }
            else {
                buffer1.append(ch);
            }

        }
        System.out.println(buffer1);

    }

}
