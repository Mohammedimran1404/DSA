package PracticePrograms;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] array={1,4,2,6,3,9};
        int maxArray=array[0];

        for (int i=0;i<array.length;i++){
            if (array[i]>maxArray){
                maxArray=array[i];
            }
        }
        System.out.println("MaxArray is "+maxArray);
    }
}
