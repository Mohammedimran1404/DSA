package Programs;

import java.util.HashSet;

public class FindingDuplicateValueInArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,1,5,4};

        HashSet<Integer> unique=new HashSet<>();
        HashSet<Integer>duplicate=new HashSet<>();

        for(int num:array){
            if(!unique.add(num)){
                duplicate.add(num);
            }
        }
        if (duplicate.isEmpty()){
            System.out.println("Unique Array");
        }
        else {
            System.out.println("duplicate");
            for (int num:duplicate){
                System.out.println(num);
            }

        }

    }
}
