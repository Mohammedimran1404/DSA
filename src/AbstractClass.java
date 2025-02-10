public abstract class AbstractClass {

    abstract void m1();

    public void m2(){
        System.out.println("concrete method");
    }

}

class other extends AbstractClass{

    public void m1(){
        System.out.println("i am un");
    }

}

class mine extends AbstractClass{
    public void m1(){
        System.out.println(" i am mine");
    }
}
