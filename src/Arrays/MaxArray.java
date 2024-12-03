package Arrays;

public class MaxArray {

    public static void main(String[] args) {

        int array[] = {1, 4, 3, 6, 2};

        int maxArray = array[0];


        for (int i = 1; i < array.length; i++) {

            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        System.out.println(maxArray);

    }
}
