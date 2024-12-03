package ArrayListInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeArraylist {
    public static void main(String[] args) {

        ArrayList<String>prac=new ArrayList<>(List.of("Apple","Ball","Cat","Dog"));

        Iterator<String> it=prac.iterator();

        while(it.hasNext()){
            if(!it.next().equalsIgnoreCase("Apple")){
                it.remove();

            }
        }
        System.out.println(prac);




        for (int i=0;i<prac.size();i++){
            if(!prac.get(i).equalsIgnoreCase("Apple")){
               prac.remove(i);
            }
        }
        System.out.println(prac);



    }
}
