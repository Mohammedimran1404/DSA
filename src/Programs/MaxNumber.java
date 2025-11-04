package Programs;

public class MaxNumber {
    public static void main(String[] args) {
        int num = 1294;
        int maxNumber = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            if (rem > maxNumber) {
                maxNumber = rem;
            }
        }
        System.out.println(maxNumber);
    }
}
