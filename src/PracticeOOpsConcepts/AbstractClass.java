package PracticeOOpsConcepts;

public abstract class AbstractClass {
    static int count;
public AbstractClass(){
    count++;
    System.out.println(count);
}
    public static void skin() {
        System.out.println("Skin is common for all");
    }

    public abstract void sound();

    public final void sleeping() {
        System.out.println("Every human being will sleep");
        eyes();

    }

    private void eyes() {
        System.out.println("Every has two eyes");
    }

    public void m1() {
        System.out.println("check");
    }
}
