// You are given an integer array nums and an integer k.

// In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

// The score of nums is the difference between the maximum and minimum elements in nums.

// Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

import java.util.Arrays;

public class Question8 {
    public static int minScore(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int minScore = nums[n - 1] - nums[0];

        for (int i = 0; i < n - 1; i++) {
            int minValue = Math.min(nums[0] + k, nums[i + 1] - k);
            int maxValue = Math.max(nums[n - 1] - k, nums[i] + k);
            minScore = Math.min(minScore, maxValue - minValue);
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minScore(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}
