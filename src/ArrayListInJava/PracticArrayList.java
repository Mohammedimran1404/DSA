package ArrayListInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("jackfruit");
        fruits.add("sapota");
// sorting the elements in ascending order
        Collections.sort(fruits);
        System.out.println(fruits);
        // sorting the elements in descending order
        Collections.sort(fruits,Collections.reverseOrder());
        System.out.println("reverse order "+fruits);

        // first approach to clone one arraylist data to other arraylist
        ArrayList<String>getFruits=(ArrayList<String>) fruits.clone();
        System.out.println("clone arraylist from first approach is "+getFruits);

      // second Approach to clone one arraylist data to other arraylist
        ArrayList<String>secondApproach=new ArrayList<>(getFruits);
        System.out.println("clone arraylist from second approach is "+secondApproach);

     // removing elements from arraylist
       String removeFruits= fruits.remove(1);
        System.out.println("the remove fruits is "+removeFruits);


    // clearing the elements from arraylist
        fruits.clear();
        System.out.println("All fruits are clear "+fruits);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add(null);
        arrayList.add("1");
        arrayList.add("");

        ArrayList<String> newArrayList=new ArrayList<>(arrayList);
        System.out.println("the new arraylist is "+newArrayList);


        ArrayList<String> cloneArrayList=(ArrayList<String>) newArrayList.clone();
        cloneArrayList.replaceAll(n-> n+1);  // called lambda expression need to learn
        System.out.println("clone array list is "+cloneArrayList);





    }
}
