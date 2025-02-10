package Abstract;

public abstract class Animal {

    String strName;
    final int a;

    static int b;

    public  Animal(String strName, int a){
        this.strName=strName;
        this.a = a;
        b=b+1;
        System.out.println(b);
    }
    public abstract void bark();
    

    public void sleep(){
        long b=a;
        System.out.println(strName+" sleeping from "+b+"days");
    }

}
