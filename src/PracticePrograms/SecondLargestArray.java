package PracticePrograms;

public class SecondLargestArray {
    public static void main(String[] args) {
                int[] arr = {12, 34, 90, 78, 90, 90, 45};

                if (arr.length < 2) {
                    System.out.println("Array must have at least two elements.");
                } else {
                    int largest = Integer.MIN_VALUE;
                    int secondLargest = Integer.MIN_VALUE;
//                    int[] arr = {12, 34, 90, 78, 90, 90, 45};
                    for (int num : arr) {
                        if (num > largest) {
                            secondLargest = largest;
                            largest = num;
                        }
                        else if (num > secondLargest && num != largest) {
                            secondLargest = num;
                        }
                    }

                    if (secondLargest == Integer.MIN_VALUE) {
                        System.out.println("No second distinct largest element found.");
                    } else {
                        System.out.println("The second largest element is: " + secondLargest);
                        System.out.println("The second largest element is: " + largest);
                    }
                }
            }
        }
