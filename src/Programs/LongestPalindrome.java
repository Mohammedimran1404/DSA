package Programs;

public class LongestPalindrome {
    public static void main(String[] args) {
            String s = "abdabba";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome (center at i)
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > (end - start + 1)) {
                    start = l;
                    end = r;
                }
                l--;
                r++;
            }
            // Even length palindrome (center between i and i+1)
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > (end - start + 1)) {
                    start = l;
                    end = r;
                }
                l--;
                r++;
            }
        }
        String longest = s.substring(start, end + 1);
        System.out.println("Longest Palindromic Substring: " + longest);
    }
}
