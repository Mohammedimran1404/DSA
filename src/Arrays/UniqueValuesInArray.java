package Arrays;

public class UniqueValuesInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 6};
// if u want to print duplicate values at that time just changed the flag value as vice versa
        for (int i = 0; i < array.length; i++) {
            boolean value = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    value = false;
                    break;
                }
            }
            if (value) {
                System.out.println(array[i]);
            }
        }
    }
}
