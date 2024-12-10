package LinearSearchAlgorithm;

public class CountingOfNumbersInAInteger {
    public static void main(String[] args) {
        int number=45678;
        int count=0;
        while(number>0){
            count++;
            number/=10;
        }
        System.out.println(count);

    }
}
