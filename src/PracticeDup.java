public class PracticeDup {
    public static void main(String[] args) {
        String s = "abaz";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longest.length()) {
                    longest = s.substring(left, right + 1);
                    System.out.println(longest);
                }
                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longest.length()) {
                    longest = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        System.out.println("Input: " + s);
        System.out.println("Longest Palindromic Substring: " + longest);
    }
}





