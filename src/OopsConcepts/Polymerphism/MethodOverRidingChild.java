package OopsConcepts.Polymerphism;

public class MethodOverRidingChild extends MethodOverRiding{
    @Override
    public void m1(){
        System.out.println("i am child class \"subclass\"");
    }

    public static void main(String[] args) {
        MethodOverRiding child=new MethodOverRiding();
        child.m1();
    }
}
