/*

Обхід Матриці Змійкою

Обійти матрицю "змійкою" і повернути всі числа в одномірному масиві.
Наприклад:
Для
[[ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]]
повернути
[1, 4, 7, 8, 5, 2, 3, 6, 9]

 */


public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int index = 0;
        int output[] = new int[input.length * input[0].length];
        for (int j = 0; j < input[0].length; j++) {            //j - cols
            if (j % 2 == 0) {
                for (int i = 0; i < input.length; i++) {    //i - rows
                    output[index] = input[i][j];
                    index++;
                }
            } else {
                for (int i = input.length - 1; i >= 0; i--) {    //i - rows
                    output[index] = input[i][j];
                    index++;
                }
            }
        }
        return output;
    }
}