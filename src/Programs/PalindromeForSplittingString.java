package Programs;

public class PalindromeForSplittingString {
    public static void main(String[] args) {

        String str = "malayalam dad";

        String[] splitArray = str.split(" ");
        for (String word : splitArray) {
            int left = 0;
            int right = word.length() - 1;
            boolean value = true;
            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    value = false;
                    break;
                }
                left++;
                right--;
            }
            if (value) {
                System.out.println(word + " is palindrome");
            } else {
                System.out.println(word + " not a palindrome");
            }
        }

    }
}
