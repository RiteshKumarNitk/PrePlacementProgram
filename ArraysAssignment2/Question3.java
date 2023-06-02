// We define a harmonious array as an array where the difference between its maximum value
// and its minimum value is exactly 1.

// Given an integer array nums, return the length of its longest harmonious subsequence
// among all its possible subsequences.

// A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static int findLHS(int[] nums) {
        // Create a frequency map to count the occurrences of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int longestSubsequenceLength = 0;

        // Iterate over the keys in the frequency map
        for (int key : frequencyMap.keySet()) {
            // Check if the frequency of the current number and the frequency of the number with a difference of 1
            // (if it exists) form a harmonious subsequence
            if (frequencyMap.containsKey(key + 1)) {
                int currentLength = frequencyMap.get(key) + frequencyMap.get(key + 1);
                longestSubsequenceLength = Math.max(longestSubsequenceLength, currentLength);
            }
        }

        return longestSubsequenceLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequenceLength = findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + longestSubsequenceLength);
    }
}
