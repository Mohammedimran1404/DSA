package Abstract;

public class Goat extends Animal{

   public Goat(String strName,int days){
       super(strName,days);
   }

    @Override
    public void bark() {
        System.out.println("goat says maaaa");
    }
}
