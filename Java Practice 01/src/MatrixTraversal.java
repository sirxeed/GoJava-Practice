/*
Обійти матрицю по спіралі і записати всі числа в одмірний масив.
Для матриці
[[1,   2,  3,  4],
 [5,   6,  7,  8]
 [9,  10, 11, 12]
 [13, 14, 15, 16]]
вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
 */

public class MatrixTraversal {

    /*
       public static void main(String[] args) {
           print(new int[][]
                   {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}});
       }
   */
    public static int[] print(int[][] input) {

        int[] output = new int[input.length * input[0].length];
        try {
            output[0] = input[0][0];
        } catch (ArrayIndexOutOfBoundsException ex) {
            return new int[]{};
        }

        //'i' - cols
        //'j' - rows

        int borderLeft = 0;
        int borderRight = input[0].length - 1;
        int borderTop = 0;
        int borderBottom = input.length - 1;
        int index = 0;

        while ((borderRight - borderLeft) >= 1 || (borderBottom - borderTop) >= 1) {
            //Left to right
            for (int i = borderLeft; i <= borderRight; i++) {
                output[index] = input[borderTop][i];
                index++;
            }
            borderTop++;

            //Top to bottom
            for (int i = borderTop; i <= borderBottom; i++) {
                output[index] = input[i][borderRight];
                index++;
            }
            borderRight--;

            //Right to left
            if (index >= output.length) {
                break;
            }
            for (int i = borderRight; i >= borderLeft; i--) {
                output[index] = input[borderBottom][i];
                index++;
            }
            borderBottom--;

            //Bottom to top
            for (int i = borderBottom; i >= borderTop; i--) {
                output[index] = input[i][borderLeft];
                index++;
            }
            borderLeft++;


        }

        return output;
    }
}