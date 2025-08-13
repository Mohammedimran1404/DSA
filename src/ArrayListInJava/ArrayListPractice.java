package ArrayListInJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        // Sorting
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(2);
        // Ascending order
        Collections.sort(list1);
        System.out.println(list1);
        // descending order
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

    }

}
