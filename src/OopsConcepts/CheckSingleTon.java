package OopsConcepts;

public class CheckSingleTon {

    /**
     * if the obj1 and obj2 is true then the single ton pattern is working fine because same
     * instance is using to all objects
     * @param args
     */
    public static void main(String[] args) {
        SingleTonPattern obj1 = SingleTonPattern.getSingleTonPattern();
        SingleTonPattern obj2 = SingleTonPattern.getSingleTonPattern();

        System.out.println(obj1==obj2);

    }
}
