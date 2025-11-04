package Programs;

public class PalindromeUsingTwoPointers {
    public static void main(String[] args) {
        String str = "malayalam";
        int left = 0;
        int right = str.length() - 1;
          boolean value=true;
        while (left < right) {
            if (str.charAt(left)!=str.charAt(right)){
                value=false;
            }
            left++;
            right--;
        }
        if (value){
            System.out.println(str+" is palindrome");
        }
        else {
            System.out.println(str+" not palindrome");
        }
    }
}
