public class Q18_ArmstrongNumbersInRange {
    public static void main(String[] args) {
        int start = 100;
        int end = 1000;

        for (int num = start; num <= end; num++) {
            int temp = num;
            int digits = 0;

            while (temp != 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                int power = 1;

                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}