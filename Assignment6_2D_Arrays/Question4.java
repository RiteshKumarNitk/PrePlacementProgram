package Assignment6_2D_Arrays;

import java.util.*;
public class Question4 {
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;

            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};

        int maxLength = findMaxLength(nums);

        System.out.println("Maximum length of contiguous subarray: " + maxLength);
    }
}
