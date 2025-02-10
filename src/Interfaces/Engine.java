package Interfaces;

public interface Engine {
  int a=10;
    void start();

    default void brake(){
        System.out.println("use brake technique");
        seatBelt();
    }

    private void seatBelt(){
        System.out.println("wear seatbelt to avoid accidents");
    }

     static void fourTyres(){
        System.out.println("Every car should have four tyres");
    }
}
