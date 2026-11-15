public class Q43_AverageSalary {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary));
    }

    static double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for (int n : salary) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}
