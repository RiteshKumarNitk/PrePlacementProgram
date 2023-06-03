
public class Question5 {
    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println(completeRows);
    }

    public static int arrangeCoins(int n) {
        int completeRows = 0;
        int currentRow = 1;

        while (n >= currentRow) {
            n -= currentRow;
            completeRows++;
            currentRow++;
        }

        return completeRows;
    }
}
