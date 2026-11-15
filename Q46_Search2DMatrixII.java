public class Q46_Search2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        System.out.println(searchMatrix(matrix, 5));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix)
            for (int n : row)
                if (n == target) return true;
        return false;
    }
}
