import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }

    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // Invalid input, not a doubled array
        }

        int[] original = new int[changed.length / 2];
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of elements in the changed array
        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Process each element in the changed array
        int i = 0;
        for (int num : changed) {
            if (freqMap.getOrDefault(num, 0) == 0) {
                continue; // Skip if already used
            }

            // Check if the element's doubled value exists in the freqMap
            int doubledValue = num * 2;
            if (freqMap.getOrDefault(doubledValue, 0) == 0) {
                return new int[0]; // Invalid input, not a doubled array
            }

            // Add the original value to the original array
            original[i] = num;
            i++;

            // Update the frequency in the freqMap
            freqMap.put(num, freqMap.get(num) - 1);
            freqMap.put(doubledValue, freqMap.get(doubledValue) - 1);
        }

        return original;
    }
}
