package ArrayListInJava;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> twoDArrayList=new ArrayList<>();

        ArrayList<String> outerArraylist=new ArrayList<>();
        outerArraylist.add("1");
        outerArraylist.add("2");

        ArrayList<String> innerArraylist=new ArrayList<>();
        innerArraylist.add("1");
        innerArraylist.add("2");
        innerArraylist.add("3");
        innerArraylist.add("4");

        twoDArrayList.add(outerArraylist);
        twoDArrayList.add(innerArraylist);
        for(int i=0;i<twoDArrayList.size();i++){
            System.out.println("2D Arraylist is "+twoDArrayList.get(i));

        }

//        twoDArrayList.get(0).add("7");

       String s= twoDArrayList.get(1).get(2);
        System.out.println(s);





    }
}
