package Sorting;

import java.util.Arrays;

public class SortingInDescending {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length - 1; i++) {
            boolean value = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    value = true;
                }
            }
            if (!value) {
                break;
            }
            System.out.println(Arrays.toString(array));
        }

    }
}
