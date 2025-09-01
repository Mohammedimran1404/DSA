public interface Test {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public static final int a=10;


    void m1();

    static void m2(){
        System.out.println("I am static method");
    }

    default void m3(){
        System.out.println("I am default method");
    }

    private void m4(){
        System.out.println("I am private ");
    }
}
