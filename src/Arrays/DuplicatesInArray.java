package Arrays;


public class DuplicatesInArray {
    public static void main(String[] args) {
       int array[]={1,4,2,3,5,3,1};
       for(int i=0;i<array.length;i++){
           for(int j=i+1;j<array.length;j++){

               if(array[i]==array[j]) {
                   System.out.println(array[i]);
               }
           }
       }


    }
    }

