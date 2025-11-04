package Interfaces;

public class Car {

    private Engine engine;

    Car(Engine engine){
        this.engine=engine;

    }
    void startEngine(){
        engine.start();
    }

    public static void main(String[] args) {
        PetrolEngine petrolEngine=new PetrolEngine();
        ElectricEngine electricEngine=new ElectricEngine();


        Car myPetrolCar=new Car(petrolEngine);
        myPetrolCar.startEngine();
//        Engine.fourTyres();
//        petrolEngine.brake();


    }
}
