package Assignment6_2D_Arrays;

public class Question8 {

    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (mat1[i][j] != 0) {
                    for (int l = 0; l < n; l++) {
                        result[i][l] += mat1[i][j] * mat2[j][l];
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};

        int[][] result = multiply(mat1, mat2);

        System.out.println("Result of mat1 x mat2:");
        for (int[] row : result) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
