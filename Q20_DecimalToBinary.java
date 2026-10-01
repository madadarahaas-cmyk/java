public class Q20_DecimalToBinary {
    public static void main(String[] args) {
        int num = 25;
        int n = num;
        String binary = "";

        if (n == 0) {
            binary = "0";
        } else {
            while (n > 0) {
                binary = (n % 2) + binary;
                n /= 2;
            }
        }

        System.out.println("Binary: " + binary);
    }
}