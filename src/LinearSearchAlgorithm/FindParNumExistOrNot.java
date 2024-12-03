package LinearSearchAlgorithm;

public class FindParNumExistOrNot {
    public static void main(String[] args) {
        int searchingNum = 14;
        boolean value = false;
        int[] array = {1, 2, 3, 4, 5, 6, 14, 7, 9};

        for (int i = 0; i < array.length; i++) {

            if (searchingNum == array[i]) {
                value = true;
                break;
            }
        }

        if (value){
            System.out.println(searchingNum+" is exist in the array");
        } else if (!value) {
            System.out.println(searchingNum+" is not exist in the array");

        }
    }
    }

