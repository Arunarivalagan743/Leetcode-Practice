public class MatrixRotation {

    // Function to rotate a matrix 90 degrees clockwise
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] rotated = new int[m][n];

        // Rotate matrix by 90 degrees
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }

    // Function to check if target matrix can be obtained by rotating mat
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (areEqual(mat, target)) {
                return true;
            }
            mat = rotate(mat);  // Rotate mat 90 degrees
        }
        return false;
    }

    // Helper function to check if two matrices are equal
    public static boolean areEqual(int[][] mat, int[][] target) {
        if (mat.length != target.length || mat[0].length != target[0].length) {
            return false;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, 1},
                {1, 0}
        };

        int[][] target = {
                {1, 0},
                {0, 1}
        };

        System.out.println(findRotation(mat, target));  // Output: true
    }
}
