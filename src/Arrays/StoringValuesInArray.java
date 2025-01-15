package Arrays;

public class StoringValuesInArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 9, 5, 6};

        int[] newArray = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            newArray[count] = array[i];
            count++;

        }
        for (int i=0;i<count;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
