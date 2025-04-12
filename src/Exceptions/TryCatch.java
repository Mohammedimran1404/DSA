package Exceptions;

public class TryCatch {
    public static void main(String[] args) {

        int[] array={1,2};
        try {
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException e){

        }
        finally {
            System.out.println("Close");
        }
    }
}
