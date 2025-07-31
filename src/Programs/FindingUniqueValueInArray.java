package Programs;

import java.util.LinkedHashSet;

public class FindingUniqueValueInArray {
    public static void main(String[] args) {

        int[] array={1,2,3,4,1,2};
        LinkedHashSet<Integer> unique=new LinkedHashSet<>();
        LinkedHashSet<Integer>duplicate=new LinkedHashSet<>();

        for(int num:array){
            if(!unique.add(num)){
                duplicate.add(num);
            }
        }
        unique.removeAll(duplicate);

        System.out.println(unique);

    }
}
