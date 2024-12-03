package ArrayListInJava;

import java.util.ArrayList;
import java.util.List;

public class StoringArrayList {
    public static void main(String[] args) {
        StoringArrayList storingArrayList=new StoringArrayList();
        ArrayList<String> citiesNames=   storingArrayList.setArrayList();
        ArrayList<String> citiesNames1=  storingArrayList.setNewArrayList();
        storingArrayList.validateTwoArrayList(citiesNames,citiesNames1);
        storingArrayList.directApproach();


    }

    public  ArrayList<String> setArrayList() {

        ArrayList<String> citiesNames = new ArrayList<>(List.of("Hyderabad", "Benguluru", "Chennai", "Mumbai"));
        return citiesNames;

    }
    public  ArrayList<String> setNewArrayList() {

        ArrayList<String> citiesNames = new ArrayList<>(List.of("Hyderabad", "Benguluru", "Chennai", "Mumbai"));
        return citiesNames;

    }

    public void validateTwoArrayList(ArrayList<String> cityNames1,ArrayList<String> cityNames2){

        boolean value=true;
        if(cityNames1.equals(cityNames2)){
            value=true;
        }
        if(value){
            System.out.println("PASSED");
        }

    }

    public void directApproach(){
        boolean value=true;
        if(setArrayList().equals(setNewArrayList())){
            setArrayList().addAll(setNewArrayList());
            value=true;
        }
        if(value){
            System.out.println(setArrayList());
            System.out.println("direct approach is PASSED");
        }
    }


}

