package OopsConcepts;

public class ConstructorChaining {
//    calling one constructor in another constructor know as constructor chaining
//    can be achieved by this() and super().
    ConstructorChaining(){
        this(5);
        System.out.println("this is a constructor without parameters");

    }
    ConstructorChaining(int i){
        this("Java");
        int x=5+i;
        System.out.println(x);
        System.out.println("this is a int type constructor");

    }

    ConstructorChaining(String str){
        System.out.println("String type constructor");

    }
    public static void main(String[] args) {
        ConstructorChaining chaining=new ConstructorChaining(5);


    }
}
