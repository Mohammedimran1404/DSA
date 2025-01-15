package OopsConcepts;

public class StaticBlockExecution {

    static {
        System.out.println("Hello, i am a static block will execute before the main method");
    }

    public static void main(String[] args) {
        System.out.println("Hey, i am main method");
    }

}
