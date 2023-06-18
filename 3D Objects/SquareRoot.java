public class SquareRoot {
    public static int mysqrt(int x) {
        if (x < 2)
            return x;

        long low = 2;
        long high = x / 2;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (mid * mid <= x && ((mid + 1) * (mid + 1)) > x) {
                return (int) mid;
            } else if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mysqrt(x));

        x = 4;
        System.out.println(mysqrt(x));
    }
}
