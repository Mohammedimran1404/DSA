package Programs;

public class CharacterShiftProgram {
    public static void main(String[] args) {
        String str="aceg";
        //String output="bdfh";
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            char output=(char)(ch+1);
            builder.append(output);
        }
        System.out.println(builder);
    }
}
