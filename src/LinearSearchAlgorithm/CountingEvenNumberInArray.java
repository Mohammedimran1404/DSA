package LinearSearchAlgorithm;

public class CountingEvenNumberInArray {
    public static void main(String[] args) {

        int[] array = {234, 566787, 76655, 1223, 56789533, 761};
        int evenCount = 0;
        int number;
        for (int i = 0; i < array.length; i++) {
            number = array[i];
            int count = 0;
            while (number > 0) {
                count++;
                number /= 10;
            }
            if (count % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);

    }
}
