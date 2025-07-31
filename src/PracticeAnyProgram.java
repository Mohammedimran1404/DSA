import java.util.HashMap;
import java.util.Map;

public class PracticeAnyProgram {
    public static void main(String[] args) {

        String str = "abcdbca";
        char[] charArray = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : charArray) {
            Integer value = map.getOrDefault(ch, 0);
            map.put(ch,value+1);
        }

//        System.out.println(map);

        boolean hasDuplicate = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + (entry.getValue() - 1));
                hasDuplicate = true;
            }
        }



        if (!hasDuplicate) {
            System.out.println("Unique Array");

        }
    }
}














