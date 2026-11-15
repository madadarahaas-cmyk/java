import java.util.HashSet;

public class Q42_ArithmeticProgression {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    static boolean canMakeArithmeticProgression(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            set.add(n);
        }
        int d = max - min;
        if (d % (arr.length - 1) != 0) return false;
        d /= arr.length - 1;
        for (int i = 0; i < arr.length; i++)
            if (!set.contains(min + i * d)) return false;
        return true;
    }
}
