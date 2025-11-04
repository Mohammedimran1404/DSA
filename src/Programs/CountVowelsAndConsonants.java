package Programs;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str="javaprogramming";
        StringBuffer vowels=new StringBuffer();
        StringBuffer consonants=new StringBuffer();
        int vowelsCount=0;
        int consonantsCount=0;
        for (char ch:str.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels.append(ch);
                vowelsCount++;
            }
            else {
                consonants.append(ch);
                consonantsCount++;
            }
        }
        System.out.println("Vowels "+ vowelsCount+" "+vowels);
        System.out.println("consonants "+consonantsCount+" "+consonants);
    }
}
