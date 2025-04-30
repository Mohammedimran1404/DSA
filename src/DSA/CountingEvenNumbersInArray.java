package DSA;

public class CountingEvenNumbersInArray {
    public static void main(String[] args) {
        int[] array={33,2,122,2223};
        int totalCount=0;
        for(int number:array){
            int count=0;
            while(number>0){
                count++;
                number=number/10;

            }
            if (count%2==0){
                totalCount++;
            }
        }
        System.out.println(totalCount);
    }
}
