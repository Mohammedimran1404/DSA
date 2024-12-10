package Arrays;

public class sorting {
    public static void main(String[] args) {

        int array[]={5,4,3,2,1};
        System.out.println(array.length);
//        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){

                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
//        }

        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }

    }




    }

