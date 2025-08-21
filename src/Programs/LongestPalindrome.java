package Programs;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str="abbacd";
         String longest="";

         for (int i=0;i<str.length();i++){
             int left=i,right=i;

             while(left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)){
                 if(right-left+1>longest.length()){
                     longest=str.substring(left,right+1);
                 }
                 left--;
                 right++;

             }

         }
        System.out.println(longest);
    }
}
