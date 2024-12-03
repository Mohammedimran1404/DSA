package ArrayListInJava;

import java.util.ArrayList;
import java.util.List;

public class ReplacingElementFromArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList(List.of("Hyderabad","Chennai","Mumbai","Bhopal"));

        ArrayList<String>newArrayList=new ArrayList<>();

        for (int i = 0; i <arrayList.size() ; i++) {
            if("Chennai".equalsIgnoreCase(arrayList.get(i))){
                arrayList.set(i,"Calcutta");
            }

        }
        newArrayList.addAll(arrayList);
        System.out.println(newArrayList);


    }
}
