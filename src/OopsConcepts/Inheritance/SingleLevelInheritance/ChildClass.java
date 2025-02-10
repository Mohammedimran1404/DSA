package OopsConcepts.Inheritance.SingleLevelInheritance;

public class ChildClass extends BaseClass {
    public void messageOfChild(){
        System.out.println("i am child class");
    }

    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
//        or
        BaseClass baseClass=new ChildClass();
        baseClass.message();
        childClass.message();
        String str1 = childClass.str;
        System.out.println(str1);
        childClass.messageOfChild();


    }
}
