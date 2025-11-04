package Programs;

public class ReverseString {
    public static void main(String[] args) {
        String str="malayalam";

        int left=0;
        int right=str.length()-1;
        char[] s =str.toCharArray();

        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;

        }
        System.out.println(new String(s)); // new String(s) method will convert char into string format

    }
}
