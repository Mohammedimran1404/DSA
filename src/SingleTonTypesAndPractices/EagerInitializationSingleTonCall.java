package SingleTonTypesAndPractices;

public class EagerInitializationSingleTonCall {

    public static void main(String[] args) {
        EagerInitializationSingleTon obj1=EagerInitializationSingleTon.getInstance();
        EagerInitializationSingleTon obj2=EagerInitializationSingleTon.getInstance();

        System.out.println(obj2==obj2);
    }
}
