package Interfaces;

public class PetrolEngine implements Engine,Sound{
    @Override
    public void start() {
        System.out.println("Petrol engine start");
    }

    public void brake(){
        Sound.super.brake();
        Engine.super.brake();
    }



}
