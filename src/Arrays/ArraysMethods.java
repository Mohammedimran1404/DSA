package Arrays;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        int[] descendingArray = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array).hashCode());

        int newArray[] = array.clone();
        System.out.println(Arrays.toString(newArray).hashCode());

        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 2);

        System.out.println("fill array " + Arrays.toString(array));

        Arrays.sort(descendingArray);

        for (int i = 0; i < descendingArray.length; i++) {
            System.out.print(descendingArray[i] + ", ");
        }
        System.out.println();


        int array2D[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.print("[ ");
        for (int i=0;i<array2D.length;i++){
            for(int j=0;j<array2D[i].length;j++){
                System.out.print(array2D[i][j]);
                if(j<array2D[i].length-1||i<array2D.length-1){
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");


        String str="Mohammed Imran";
       char ch[]= str.toCharArray();
        System.out.println("to character "+Arrays.toString(ch));

    }


}
