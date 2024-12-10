package LinearSearchAlgorithm;

public class SearchNumIn2DArray {
    public static void main(String[] args) {

        int[][] array2D ={{1,2,3,4},{5,6,7},{8,9}};

        int targetNumber=7;

        for (int i = 0; i <array2D.length ; i++) {

            for (int j = 0; j <array2D[i].length ; j++) {

                if(array2D[i][j]==targetNumber){
                    System.out.println(array2D[i][j]);


                }



            }

        }
    }
}