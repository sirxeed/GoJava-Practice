public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        //Let's find maximum 'x' and 'y'
        int maxX = w[0] + x[0];
        int maxH = h[0];
        for (int i = 0; i < x.length; i++) {
            if (maxX < w[i] + x[i]) {
                maxX = w[i] + x[i];
            }
            if (maxH < h[i]) {
                maxH = h[i];
            }
        }

        int[][] matrix = new int[maxX][maxH];

        //Let's fill matrix
        for (int i = 0; i < x.length; i++) {
            for (int j = x[i]; j < w[i] + x[i]; j++) {
                for (int y = 0; y < h[i]; y++) {
                    matrix[j][y] = 1;
                }
            }
        }

        //Let's find a square
        int square = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                square += matrix[i][j];
            }

        }
        
        return square;
    }
}