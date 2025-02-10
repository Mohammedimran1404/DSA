package SingleTonTypesAndPractices;

public class LazyInitializationSingleTonCall {
    public static void main(String[] args) {

        String strFirstMessage=LazyInitializationSingleTon.getLazyInitializationSingleTon().getMessage();
        String strLastMessage=LazyInitializationSingleTon.getLazyInitializationSingleTon().getOtherMessage();


    }
}
