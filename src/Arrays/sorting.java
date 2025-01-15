package Arrays;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {

        int array[] = {8,5,3};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

//        for (int k = 0; k < array.length; k++) {
//            System.out.println(array[k]);
//        }

    }


}


