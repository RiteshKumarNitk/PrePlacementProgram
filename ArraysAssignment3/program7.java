import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> missingRanges = new ArrayList<>();
        int next = lower;

        for (int num : nums) {
            // If there is a gap between the current number and the next, add a range
            if (num > next) {
                missingRanges.add(formatRange(next, num - 1));
            }

            // Move the next pointer to the next number after the current one
            next = num + 1;
        }

        // If there is a remaining gap after the last number, add a range
        if (next <= upper) {
            missingRanges.add(formatRange(next, upper));
        }

        return missingRanges;
    }

    private static String formatRange(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        List<String> missingRanges = findMissingRanges(nums, lower, upper);
        System.out.println(missingRanges);
    }
}
