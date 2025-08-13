package Programs;

public class MinAndSecMinArray {
    public static void main(String[] args) {
        int[] array={4,3,6,2,5,1};

        int minArray=array[0];
        int secMinArray=array[0];

        for (int num:array){
            if(num<minArray){
                secMinArray=minArray;
                minArray=num;
            } else if (num<secMinArray&&num!=minArray) {
                secMinArray=num;

            }
        }
        System.out.println(minArray);
        System.out.println(secMinArray);
    }
}
