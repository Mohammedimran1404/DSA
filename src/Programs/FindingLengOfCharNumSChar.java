package Programs;

public class FindingLengOfCharNumSChar {
    public static void main(String[] args) {
        String str="ball 123 @";
        StringBuilder character=new StringBuilder();
        StringBuilder number=new StringBuilder();
        StringBuilder SCharacter=new StringBuilder();
        String[] strSplit=str.split(" ");

        for(String strSingle:strSplit){
            for(char ch:strSingle.toCharArray()){
                if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
                    character.append(ch);
                } else if (ch>='0'&&ch<='9') {
                    number.append(ch);
                }
                else {
                    SCharacter.append(ch);
                }


            }
        }
        System.out.println("String length is "+character.length());
        System.out.println("number length is "+number.length());
        System.out.println("Special length is "+SCharacter.length());


    }
}
