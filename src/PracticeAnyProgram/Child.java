package PracticeAnyProgram;

public class Child extends Parent{


    public Child(String strName){
        super(10,20);
        System.out.println(strName);
    }

    public static void main(String[] args) {

        Child ch=new Child("Cat");
    }
}
