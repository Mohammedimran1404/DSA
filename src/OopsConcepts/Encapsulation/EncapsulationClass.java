package OopsConcepts.Encapsulation;

public class EncapsulationClass {

   private double balance;

   public double getBalance(){
       return balance;
   }
   public void setBalance(double balance){
           this.balance = balance;
   }

   public void addBalance(double amount){

       if(amount>=0){
           balance=balance+amount;
           System.out.println("your amount is "+balance);
       }
       else {
           System.out.println("Invalid amount");
       }

   }

    public static void main(String[] args) {
        EncapsulationClass obj=new EncapsulationClass();
        obj.setBalance(2000);
        obj.addBalance(200);
        System.out.println(obj.getBalance());
    }
}
