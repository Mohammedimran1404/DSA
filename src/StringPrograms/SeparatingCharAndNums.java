package StringPrograms;

public class SeparatingCharAndNums {
    public static void main(String[] args) {

        String str="K1a2ir3o5s";
        StringBuffer buffer1=new StringBuffer();
        StringBuffer buffer2=new StringBuffer();

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
                buffer1.append(ch);
            }
            else {
                buffer2.append(ch);
            }
        }
        System.out.println(buffer1.append(buffer2));


    }
}
