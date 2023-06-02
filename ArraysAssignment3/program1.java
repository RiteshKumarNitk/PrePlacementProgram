import java.util.Arrays;

public class program1 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the sum of the first three elements

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == target) {
                    return target; // Exact sum found, return target
                }

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum; // Update closest sum if current sum is closer to target
                }

                if (currentSum < target) {
                    left++; // Increment left pointer to increase the sum
                } else {
                    right--; // Decrement right pointer to decrease the sum
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int result = threeSumClosest(nums, target);
        System.out.println("Closest sum: " + result);
    }
}
