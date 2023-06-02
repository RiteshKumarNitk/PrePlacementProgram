import java.util.*;


public class program3 {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Find the first element from the right that is smaller than its next element
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If no such element is found, the array is in descending order
        // Reverse the array to get the lowest possible order
        if (i == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Find the next greater element to the right of nums[i]
        int j = n - 1;
        while (j > i && nums[j] <= nums[i]) {
            j--;
        }

        // Swap nums[i] and nums[j]
        swap(nums, i, j);

        // Reverse the elements from index i+1 to the end of the array
        reverse(nums, i + 1, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPermutation(nums);

        System.out.println("Next permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
