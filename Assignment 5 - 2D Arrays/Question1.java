import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = convertArray(original, m, n);
        printArray(result);
    }

    public static int[][] convertArray(int[] original, int m, int n) {
        int totalElements = m * n;
        if (original.length != totalElements) {
            return new int[0][0]; // Impossible to construct 2D array
        }

        int[][] result = new int[m][n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }

        return result;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
