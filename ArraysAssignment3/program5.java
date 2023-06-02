import java.util.Arrays;

public class 5 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by 1
            digits[i]++;

            // Check if there is a carry
            if (digits[i] < 10) {
                return digits; // No carry, return the incremented array
            }

            // Carry exists, set the current digit to 0 and continue with the next digit
            digits[i] = 0;
        }

        // If we reach this point, there is a carry in the most significant digit
        // Create a new array with an additional digit (set to 1) and copy the original digits
        int[] result = new int[n + 1];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, n);

        return result;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
