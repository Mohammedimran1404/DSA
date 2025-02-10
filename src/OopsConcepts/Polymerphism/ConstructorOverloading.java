package OopsConcepts.Polymerphism;

public class ConstructorOverloading {
    // method overloading concept with different parameters

    int a;
    int b;
    int c;

    ConstructorOverloading() {
        this.a = 10;
        this.b = 20;
        this.c = 30;
        System.out.println(a + " " + b + " " + c);
    }

    ConstructorOverloading(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a+" "+b);

    }
}

class m1 {
    public static void main(String[] args) {
        ConstructorOverloading constructorCalled = new ConstructorOverloading(100,50);
    }
}
