package LinearSearchAlgorithm;

public class Reversing2dArray {
    public static void main(String[] args) {
        int[][]array={{1,2,3},{4,5,6,7}};

        for (int i=array.length-1;i>=0;i--){
            for(int j=array[i].length-1;j>=0;j--){
                System.out.println(array[i][j]);

            }
        }
    }
}
