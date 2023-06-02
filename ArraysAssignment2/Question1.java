// Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

import java.util.Arrays;

public class Question1 {
    public static int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int sum = 0;
        // Pair up adjacent elements and sum up the smaller element in each pair
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {11, 14, 23, 20};
        int maxSum = arrayPairSum(nums);
        System.out.println("Maximum possible sum: " + maxSum);
    }
}
