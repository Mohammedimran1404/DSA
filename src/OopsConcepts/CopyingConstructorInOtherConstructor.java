package OopsConcepts;

public class CopyingConstructorInOtherConstructor {
    /**
     * copy constructor is used when we need the same data without duplicating the constructor directly we can
     * the old constructor in new constructor
     * for ex:- if a person has name and age as common to other person at that time we can use
     * copy constructor from other constructor
     */
    String strName;
    int age;
    CopyingConstructorInOtherConstructor(String strName, int age){
        this.strName=strName;
        this.age=age;

    }
    CopyingConstructorInOtherConstructor(CopyingConstructorInOtherConstructor ch){
        this.strName=ch.strName;
        this.age=ch.age;
    }
    public void display(){
        System.out.println(strName+" "+age);
    }

    public static void main(String[] args) {
        CopyingConstructorInOtherConstructor chaining1=new CopyingConstructorInOtherConstructor("Imran",25);
        CopyingConstructorInOtherConstructor chaining11=new CopyingConstructorInOtherConstructor(chaining1);
        chaining11.display();
        chaining1.display();

    }
}
