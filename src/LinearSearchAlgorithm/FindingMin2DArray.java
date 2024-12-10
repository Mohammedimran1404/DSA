package LinearSearchAlgorithm;

public class FindingMin2DArray {
    public static void main(String[] args) {

        int[][]array={{6,3,8,9},{3,4,0},{10}};

        int minValue=array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {

                if (array[i][j]<minValue){
                    minValue=array[i][j];
                }

            }

        }
        System.out.println("The min 2d array is "+minValue);
    }
}
