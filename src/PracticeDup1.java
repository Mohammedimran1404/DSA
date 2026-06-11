import java.util.ArrayList;
import java.util.Arrays;

public class PracticeDup1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");

        ArrayList<String> list1=new ArrayList<>();

        String[] a=new String[list.size()];
        for(int i=0;i<list.size();i++){
          a[i]=list.get(i);
        }

        System.out.println(Arrays.toString(a));

        for(int i=0;i<a.length;i++){
           list1.add(a[i]);
        }
        System.out.println(list1);
    }
}