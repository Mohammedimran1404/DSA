package StringPrograms;

public class FindingUniqueCharactersInWordsSeparately {
    public static void main(String[] args) {
        String str="MicroSoft apple";
        String[] strArray=str.split(" ");

        for (String strWord:strArray){
            String[] strNewArray=strWord.split("");
            for (int i=0;i<strNewArray.length;i++){
                int count=0;
                for (int j=0;j<strNewArray.length;j++){
                    if(strNewArray[i].equalsIgnoreCase(strNewArray[j])){
                        count++;
                    }
                }
                if (count==1){
                    System.out.print(strNewArray[i]);
                }
            }
            System.out.println();
        }
    }
}
