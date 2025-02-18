package PracticePrograms;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] array={1,5,5,6,2,2,8,8};
//        o/p is 1,5,6,2,8

        int j=0;
        for (int i=1;i<array.length;i++) {
            if (array[i] != array[j]) {
                j++;
                int temp = array[j];
                array[j]=array[i];
                array[i]=temp;

            }
        }
        for (int i=0;i<=j;i++){
            System.out.println(array[i]);
        }
    }
}
