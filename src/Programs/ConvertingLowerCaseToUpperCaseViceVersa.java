package Programs;

public class ConvertingLowerCaseToUpperCaseViceVersa {
    public static void main(String[] args) {
        String str="TeA";
        StringBuffer buffer=new StringBuffer();

        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                buffer.append(Character.toLowerCase(str.charAt(i)));
            } else if (str.charAt(i)>='a'&&str.charAt(i)<='z') {
                buffer.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(buffer);
    }
}
