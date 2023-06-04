public class Question2 {
    public static void main(String[] args) {
        int n = 5;
        int completeRows = countCompleteRows(n);
        System.out.println(completeRows);
    }

    public static int countCompleteRows(int n) {
        int completeRows = 0;
        int coinsRemaining = n;

        int row = 1;
        while (coinsRemaining >= row) {
            coinsRemaining -= row;
            completeRows++;
            row++;
        }

        return completeRows;
    }
}
