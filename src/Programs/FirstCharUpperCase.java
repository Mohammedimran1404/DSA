package Programs;

public class FirstCharUpperCase {
    public static void main(String[] args) {
        String str="hello world";
        StringBuilder first=new StringBuilder();
        StringBuilder remaining=new StringBuilder();
        StringBuilder finalResult=new StringBuilder();
        String[] strArray=str.split(" ");
        for(String word:strArray){
            first.setLength(0);
            remaining.setLength(0);
            first.append(word.substring(0,1).toUpperCase());
            remaining.append(word.substring(1));
            finalResult.append(first).append(remaining).append(" ");
        }
        System.out.println(finalResult);
    }
}
