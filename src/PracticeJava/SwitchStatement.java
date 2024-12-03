package PracticeJava;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the fruit name");
        String strFruit=scanner.next();

        switch (strFruit) {
            case "mango" -> System.out.print("mango");
            case "apple" -> System.out.print("apple");
            case "papaya" -> System.out.print("papaya");
            default -> System.out.print("invalid");
        }

    }
}
