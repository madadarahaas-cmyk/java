import java.util.Arrays;

public class Q44_DistanceValue {
    public static void main(String[] args) {
        int[] a = {4, 5, 8}, b = {10, 9, 1, 8};
        System.out.println(findTheDistanceValue(a, b, 2));
    }

    static int findTheDistanceValue(int[] a, int[] b, int d) {
        Arrays.sort(b);
        int count = 0;
        for (int n : a) {
            int l = 0, r = b.length - 1;
            boolean valid = true;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (Math.abs(b[m] - n) <= d) {
                    valid = false;
                    break;
                }
                if (b[m] < n) l = m + 1;
                else r = m - 1;
            }
            if (valid) count++;
        }
        return count;
    }
}
