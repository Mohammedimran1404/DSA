package Programs;

public class MaxAndSecondMaxArray {
    public static void main(String[] args) {

        int[] array={2,1,4,5,8,6};

        int maxArray=array[0];
        int secMaxArray=array[0];

        for (int num:array){
            if(num>maxArray){
                secMaxArray=maxArray;
                maxArray=num;
            } else if (num>secMaxArray&&num!=maxArray) {
                secMaxArray=num;

            }
        }
        System.out.println(maxArray);
        System.out.println(secMaxArray);






    }
}
