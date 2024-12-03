package PracticeJava;

import java.util.Scanner;

public class LowercaseAndUppercase {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().trim().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }
        else {
            System.out.println("Upper Case");
        }

    }
}
