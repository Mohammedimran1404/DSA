package LinearSearchAlgorithm;

public class SearchInRange1To4 {
    public static void main(String[] args) {
        boolean value=false;
        int startValue=1,endValue=5;
        int[] array={1,2,5,4,9,3,10};
        int targetNumber=4;
        for (int i = startValue; i <=endValue ; i++) {
            if(array[i]==targetNumber){
                value=true;
            }

        }
        System.out.println(value);
    }
}
