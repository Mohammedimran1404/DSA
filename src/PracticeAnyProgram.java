public class PracticeAnyProgram {

    public static void main(String[] args) {

                String input = "aaafffacvwww";
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < input.length(); ) { // No i++ here
                    char currentChar = input.charAt(i);
                    int count = 0;
                    // Count occurrences of currentChar
                    for (int j = i; j < input.length() && input.charAt(j) == currentChar; j++) {
                        count++;
                    }
                    result.append(currentChar);
                    if (count > 1) {
                        result.append(count);
                    }
                    i =i+count; // Move index forward by count
                }
                System.out.println(result);  // Output: a3f3acvw3

    }
}







