package Assignment6_2D_Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6 {

    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();
        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) == 0) {
                continue; // Skip if the count is already used
            }

            int half = num / 2;
            if (num % 2 == 0 && countMap.getOrDefault(half, 0) > 0) {
                originalList.add(half);
                countMap.put(half, countMap.get(half) - 1);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        if (originalList.size() != changed.length / 2) {
            return new int[0]; 
        }

        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        System.out.println("Original Array: " + java.util.Arrays.toString(original));
    }
}
