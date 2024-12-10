package LinearSearchAlgorithm;

public class FindingMaxArray2DArray {
    public static void main(String[] args) {

        int[][] array2d={{1,2,3},{4,5,6},{7,8}};

        int maxValue=array2d[0][0];

        for (int i = 0; i < array2d.length; i++) {
            for (int j=0;j<array2d[i].length;j++){

                if(array2d[i][j]>maxValue){
                    maxValue=array2d[i][j];
                }
            }

        }
        System.out.println("the max 2d array is "+maxValue);
    }
}
