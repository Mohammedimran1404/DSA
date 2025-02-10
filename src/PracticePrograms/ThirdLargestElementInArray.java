package PracticePrograms;

public class ThirdLargestElementInArray {
    public static void main(String[] args) {

        int[] array = {3, 9, 9, 1, 9, 7};

        int largestNumber = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > largestNumber) {
                third = secondlargest;
                secondlargest = largestNumber;
                largestNumber = number;
            } else if (number > secondlargest && number != largestNumber) {
                third = secondlargest;
                secondlargest = number;


            } else if (number > third && number != largestNumber && number != secondlargest) {
                third = number;

            }

        }

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("All values are same");
        } else {
            System.out.println(third);
        }

    }
}
