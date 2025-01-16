package SingleTonTypesAndPractices;

public class EagerInitializationSingleTon {

   private static final EagerInitializationSingleTon eagerInitializationSingleTon=new EagerInitializationSingleTon();

    private EagerInitializationSingleTon(){
        System.out.println("its in between");

    }

    public static EagerInitializationSingleTon getInstance(){
        return eagerInitializationSingleTon;
    }
    public static void printMessage() {
        System.out.println("Static method called");
    }


}
/**
 * Thread-safe by default.
 * Instance is created even if it’s not used.
 */
//class Main{
//    public static void main(String[] args) {
//        System.out.println("Program is started");
//        EagerInitializationSingleTon.printMessage();
//        System.out.println("Program is ended");
//    }
//
//        }
