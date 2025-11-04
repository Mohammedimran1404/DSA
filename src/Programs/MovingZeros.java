package Programs;

public class MovingZeros {
    public static void main(String[] args) {
                int num[] = {1, 2, 0, 3, 0, 1};

        int index = 0; // pointer for placing non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[index] = num[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < num.length) {
            num[index] = 0;
            index++;
        }

        // Print result
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
