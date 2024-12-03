import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class LearningString {


    public static void main(String[] args) {
        LearningString ls = new LearningString();
        ls.practice();


    }

    public void addingSpace() {
        String strString = "JavaProgramming";

        String str = "Java ";

        int index = strString.indexOf("Programming");

        String strNewString = strString.substring(0, index) + " " + strString.substring(index);
        System.out.println(strNewString);
    }

    public void lengthWords() {
        String strPrint = "Java is a programming lang";

        String[] str1 = strPrint.split(" ");

        for (String myString : str1) {

            if (myString.length() == 4) {
                System.out.println(myString);
            }
        }
    }

    public void addingTextToGivenString() {

        String str = "Java Programming Language";

        int index = str.indexOf("Programming");
        System.out.println(index);

        String newString = str.substring(0, index) + " is a " + str.substring(index);
        System.out.println(str.substring(0, index));
        System.out.println(str.substring(index));

        System.out.println(newString);
    }

    public void palindrome() {

        String strData = "pop";

        String strReversed = "";

        for (int i = strData.length() - 1; i >= 0; i--) {
            strReversed = strReversed + strData.charAt(i);
        }
        if (strData.equalsIgnoreCase(strReversed)) {
            System.out.println(strReversed + " is a Palindrome");
        } else {
            System.out.println(strReversed + " is not a Palindrome");
        }

    }

    public void replaceCharacter() {

        String str = "Java is a programming Language and its a best programming language";
        int index = str.indexOf("ogramming");
        char ch = 'O';
        String newStr = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(newStr);
    }

    public void removeLeadingZero() {

        /**
         * input =00012304
         * output=1234
         */

//        String str = "00012345";
//
//        String newString = str.replace("0", "").trim();
//
//        System.out.println(newString);

        String strString = "000123450981";

// temp is used to store the index of string
        int index = 0;

        for (int i = 0; i < strString.length(); i++) {
            char ch = strString.charAt(i);

            if (ch != '0') {
                index = i;
                break;
            }

        }
        strString = strString.substring(index);
        System.out.println(strString);
    }

    public void removingAllZerosFromString() {

        String str = "00012340500";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0') {
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
    }

    public void removingTrailingZeros() {
        String str = "12340000";

        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            if (ch != '0') {
                index = i;
                break;

            }
        }
        str = str.substring(0, index + 1);
        System.out.println(str);


    }

    public void reArrangingLettersDigits() {

        String str = "java12Programming";

        StringBuffer digits = new StringBuffer();
        StringBuffer letters = new StringBuffer();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                letters.append(ch);
            }
        }
        String newDigit = digits.toString();
        String newLetter = letters.toString();
        System.out.println(newLetter + newDigit);


    }

    public void sortString() {

        String str = "software";

        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        String sortedString = new String(ch);
        System.out.println(sortedString);
    }

    public void loops() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a table no: ");
        double tableNumber = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= tableNumber; i++) {

            sum = sum + i;

//       1+2+3+4+5
//        System.out.println(tableNumber+" * "+i+" = "+tableNumber*i );
        }
        System.out.println(sum);
        System.out.println(sum / tableNumber);
    }

    public void sumOfEvenNumbers() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a table no: ");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {

                sum = sum + i;
            }


        }
        System.out.println(sum);
        System.out.println(sum / 2);
    }

    public void whileLoops() {

        Scanner scan = new Scanner(System.in);

        boolean learn = false;
        while (!learn) {
            System.out.println("learn");
            System.out.println("enter the flag");
            learn = scan.nextBoolean();


        }
    }

    public void tables() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " * " + j + " = " + i * j);

            }
            System.out.println();
        }
    }

    public void loop() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            for (int j = 0; j < 2; j++) {
                System.out.println(j);


            }
        }

    }

    public void duplicatesvalue() {

        int arr[] = {1, 2, 3, 4, 5, 1};
        int arra[] = {7, 8, 9, 1, 2};

//            int store=0;

        for (int i = 0; i < arr.length; i++) {
            //  System.out.println("am i "+arr[i]);

            for (int j = 0; j < arra.length; j++) {
                //   System.out.println(arr[j]);
                if (arr[i] == arra[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }

    public void practice() {
        boolean value = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not`");
        int number = scanner.nextInt();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                value = false;
                break;
            }

        }
        if (value) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }


}






















