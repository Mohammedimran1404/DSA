package PracticeOOpsConcepts;

public class Abstract1 extends AbstractClass{
    @Override
    public void sound() {
        System.out.println("Sounds good");
    }
    public static void skin(){
        System.out.println("abstract one skin");
    }

    @Override
    public void m1() {
        System.out.println("check2");
    }
    public void m2(){
        super.m1();
    }

    public static void main(String[] args) {
        AbstractClass a=new Abstract1();
        a.sound();
        AbstractClass.skin();
        a.sleeping();
        a.m1();
        AbstractClass b=new Abstract1();
        b.skin();
        b.m1();
        Abstract1 c=new Abstract1();
        c.skin();
        c.m1();
        c.m2();



    }
}
