package Programs;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] array={1,2,3,5,6};

        int n=array.length+1;
        int actualSum=n*(n+1)/2;
        System.out.println(actualSum);
        int expectedSum=0;

        for(int num:array){
            expectedSum+=num;

        }
        int missingNum=actualSum-expectedSum;
        System.out.println(missingNum);
    }
}
