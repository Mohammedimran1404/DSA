package Programs;

import java.util.HashMap;
import java.util.Map;

public class MinRepeatingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 3, 1, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            int value = map.getOrDefault(num, 0);
            map.put(num, value + 1);
        }

        int minCount = Integer.MAX_VALUE;
        int minNum = array[0];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                minNum = entry.getKey();
            }

        }
        System.out.println(minCount + " " + minNum);


    }
}

/*
import java.util.*;

public class MinCountInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 1, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 1: Find min count
        int minCount = Collections.min(map.values());

        // Step 2: Collect all numbers with that count
        List<Integer> minNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == minCount) {
                minNumbers.add(entry.getKey());
            }
        }

        System.out.println("Min Count: " + minCount);
        System.out.println("Numbers with min count: " + minNumbers);
    }
}

 */