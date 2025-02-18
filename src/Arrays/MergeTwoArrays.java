package Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] array={1,2,3,4};
        int[] array1={5,6,7};

        int [] mergeArray=new int[array.length+array1.length];

        for(int i=0;i<array.length;i++){
            mergeArray[i]=array[i];

        }
        for(int i=0;i<array1.length;i++){
            mergeArray[array.length+i]=array1[i];
        }
        for (int i=0;i<mergeArray.length;i++) {
            System.out.println(mergeArray[i]);
        }
    }
}
