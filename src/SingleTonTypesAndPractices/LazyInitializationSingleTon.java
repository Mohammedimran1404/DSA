package SingleTonTypesAndPractices;

public class LazyInitializationSingleTon {

    private LazyInitializationSingleTon(){
        System.out.println("Constructor called");

    }
    private static LazyInitializationSingleTon lazyInitializationSingleTon;


    public static LazyInitializationSingleTon getLazyInitializationSingleTon(){
        if (lazyInitializationSingleTon==null){
            lazyInitializationSingleTon=new LazyInitializationSingleTon();
        }
        return lazyInitializationSingleTon;
    }

    public String getMessage(){
        String strMessage="i am a single ton lazy initialization method";
         System.out.println(strMessage);
         return strMessage;
    }
    public String getOtherMessage(){
        String strMessage="i am a single ton lazy initialization other method";
        System.out.println(strMessage);
        return strMessage;
    }
    public static void printMessage() {
        System.out.println("Static method called");
    }

}
/**
 * When the object is called then only the class is initialized
 * in single ton lazy initialization
 */
//class Main{
//    public static void main(String[] args) {
//        System.out.println("Program is started");
//        LazyInitializationSingleTon.printMessage();
//        System.out.println("Program is ended");
//    }
//
//        }
