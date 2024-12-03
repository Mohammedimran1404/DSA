package Arrays;

import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();

       arrayList.add(new ArrayList<>());
       arrayList.get(0).add(1);
       arrayList.get(0).add(2);
       arrayList.add(new ArrayList<>());
        arrayList.get(1).add(1);
        arrayList.get(1).add(2);

        System.out.println(arrayList);



    }

}
