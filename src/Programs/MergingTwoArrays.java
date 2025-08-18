package Programs;

public class MergingTwoArrays {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int[] array1 = {4, 5, 6};

        int[] newArray = new int[array.length + array1.length];

        for (int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        for (int i=0;i<array1.length;i++){
            newArray[array.length+i]=array1[i];
        }
        for (int num:newArray){
            System.out.println(num);
        }

    }
}
