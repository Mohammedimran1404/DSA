package Arrays;

public class StoringValuesIn2DArray {
    public static void main(String[] args) {
        int[][] arrayTwoD={{1,2,4},{4,5,6}};

        int[][] newTwoDArray=new int[arrayTwoD.length][arrayTwoD[0].length];

        for (int i=0;i<arrayTwoD.length;i++){
            for (int j=0;j<arrayTwoD[i].length;j++){
                newTwoDArray[i][j]=arrayTwoD[i][j];
            }
        }

        for (int i=0;i<newTwoDArray.length;i++){
            for (int j = 0; j < newTwoDArray[i].length; j++) {
                System.out.println(newTwoDArray[i][j]);

            }
        }


    }
}
