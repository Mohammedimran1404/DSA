package Exceptions;

public class CustomExceptionUsing {

    public void voteIdentification(int age) throws CustomException {
        if (age>100){
            throw new CustomException("invalid age");
        }
        else {
            System.out.println("Welcome to democracy");
        }
    }

    public void m1() throws CustomException{
        int num=10;
        if(num%0==0){
            throw new CustomException("number cannot be divided by zero");
        }
    }

    public static void main(String[] args) {
        CustomExceptionUsing c=new CustomExceptionUsing();
        try {
            c.voteIdentification(200);
        }catch (CustomException e) {
            System.out.println(e.getMessage());


        }

    }
}
