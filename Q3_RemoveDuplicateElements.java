public class Q3_RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        int[] result = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}