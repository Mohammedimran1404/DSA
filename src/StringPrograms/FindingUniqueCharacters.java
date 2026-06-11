package StringPrograms;

import java.util.Arrays;

public class FindingUniqueCharacters {
    public static void main(String[] args) {


        String str = "abcdaaaerdf";
        String[] strArray = str.split("");
        System.out.println(Arrays.toString(strArray));

        for (int i = 0; i < strArray.length; i++) {
            int count =0;
            for (int j =0; j < strArray.length; j++) {
                if (strArray[i].equalsIgnoreCase(strArray[j])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(strArray[i]);
            }
        }


    }
}
