package StringPrograms;

import java.util.Arrays;

public class PracticeString {
    public static void main(String[] args) {

        int[] array = {1, 8, 1, 2, 9,1};

        for (int i=0;i<array.length;i++){
            boolean value=true;
            for (int j=0;j<array.length;j++){
                if (i!=j&&array[i]==array[j]) {
                    value = false;

                }
            }
            if (value){
                System.out.println(array[i]);
            }
        }

    }


}





