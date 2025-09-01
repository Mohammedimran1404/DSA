package Programs;

public class MinNumber {
    public static void main(String[] args) {
        int num = 1294;
        int maxNumber = Integer.MAX_VALUE;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            if (rem < maxNumber) {
                maxNumber = rem;
            }
        }
        System.out.println(maxNumber);
    }
}
