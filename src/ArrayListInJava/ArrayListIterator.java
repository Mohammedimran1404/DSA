package ArrayListInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {
    public static void main(String[] args) {

        int a=10;
        int b=20,c=30;

        System.out.println((b>a)&&(c>b));


        ArrayList<String> cities=new ArrayList<>();

        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Vizag");
        cities.add("Bhopal");
        cities.add("Kashmir");
        System.out.println(cities.size());

        ListIterator<String> lstIterator=cities.listIterator(cities.size());
        while (lstIterator.hasPrevious()){
            System.out.println(lstIterator.previous());
        }


        Iterator<String> iterator=cities.iterator();
        while(iterator.hasNext()){
           String city= iterator.next();
            if(city.equals("Hyderabad")){
                System.out.println("it "+city);
            }

        }


    }
}
