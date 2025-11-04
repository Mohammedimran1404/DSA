package Exceptions;

public class CustomExceptionPractice {
    public static void main(String[] args) throws CustomException {
        int age=11;

        if(age>=18){
            System.out.println("eligible for vote");
        }
        else {
            throw new CustomException("you are not eligible");
        }
    }
}
