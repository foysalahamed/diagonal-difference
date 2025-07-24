public class DiagonalDifference {

    public static int diagonalDifference(int[][] matrix) {
        int n = matrix.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i]; // left to right diagonal
            secondarySum += matrix[i][n - 1 - i]; // right to left diagonal
        }

        return Math.abs(primarySum - secondarySum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        int result = diagonalDifference(matrix);
        System.out.println("Diagonal Difference: " + result); // Output: 15
    }
}
