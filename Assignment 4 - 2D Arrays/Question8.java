import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            result[idx++] = nums[i];
            result[idx++] = nums[i + n];
        }

        return result;
    }
}
