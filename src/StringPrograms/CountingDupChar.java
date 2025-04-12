package StringPrograms;

public class CountingDupChar {
    public static void main(String[] args) {
        String str="ababca";
        char[] ch=str.toCharArray();
        boolean[] visited=new boolean[ch.length];
        int maxCount=0;
        char chMax='\0';

        for (int i=0;i<ch.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    count++;
                    visited[j]=true;

                }
            }
            if(count>maxCount){
               maxCount=count;
               chMax=ch[i];
            }
        }
        System.out.println(chMax+""+maxCount);
    }
}
