package LinearSearchAlgorithm;

public class AddingOneArrayAndCheckingWhichIsGreaterIn2DArray {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 4}, {4, 3, 6}, {1, 1, 1}};

        int maxAmount = array[0][0];
//        System.out.println(maxAmount);

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }

            if(sum>maxAmount){
               maxAmount=sum;
            }

        }
        System.out.println("the richest person account balance is "+maxAmount);

    }
}
