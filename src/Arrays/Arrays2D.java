package Arrays;

public class Arrays2D {


    public static void main(String[] args) {

       int array[][]={{1,2,3,4},{3,4},{4}};


       for(int i=0;i<array.length;i++){
           for(int j=0;j<array[i].length;j++) {

               System.out.print(array[i][j]+" ");
           }
           System.out.println();
       }

    }
}