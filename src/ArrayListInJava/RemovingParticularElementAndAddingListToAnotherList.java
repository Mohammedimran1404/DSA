package ArrayListInJava;

import java.util.ArrayList;
import java.util.List;

public class RemovingParticularElementAndAddingListToAnotherList {

    public static void main(String[] args) {
        List<String> fruits =new ArrayList<>(List.of("Apple","Banana","Berry","Baigan","gulab","pineApple","mango"));
        ArrayList<String> newFruits=new ArrayList();

        for (int i = 0; i <fruits.size() ; i++) {
            if(!fruits.get(i).startsWith("B")&& !fruits.get(i).toUpperCase().endsWith("B")){
                newFruits.add(fruits.get(i));
        }
        }
        System.out.println(newFruits);






    }
}
