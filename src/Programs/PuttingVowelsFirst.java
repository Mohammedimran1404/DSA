package Programs;

public class PuttingVowelsFirst {
    public static void main(String[] args) {
        StringBuilder vowels=new StringBuilder();
        StringBuilder consonants=new StringBuilder();
        StringBuilder finalResults=new StringBuilder();
        String str="my name is imran";
        String[] strArray=str.split(" ");
        for(int i=0;i<strArray.length;i++){
            for(char ch:strArray[i].toCharArray()){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels.append(ch);
                }else{
                    consonants.append(ch);
                }
            }
            finalResults.append(vowels).append(consonants).append(" ");
            vowels.setLength(0);
            consonants.setLength(0);

        }

        System.out.println(finalResults);

    }
}
