package LinearSearchAlgorithm;

public class CountingEvenNumberInArrayByConvToString {
    public static void main(String[] args) {

        int[]array={234,566787,76655,1223,56789533,761};

        int evenCount=0;
        for (int i = 0; i <array.length ; i++) {
            String strNumber=String.valueOf(array[i]);
            int lengthOfStringNumber=strNumber.length();

            if (lengthOfStringNumber%2==0){
                evenCount++;
                System.out.println(strNumber+" has the even count of "+strNumber.length());
            }
        }
        System.out.println("total even count numbers in an array is "+evenCount);
    }
}
