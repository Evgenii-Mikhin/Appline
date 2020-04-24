//Задание №10: Ввод/вывод данных для матрицы
//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
// где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
import java.util.Arrays;
import java.util.Scanner;
public class Task10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте колличество строк ");
        int i = in.nextInt();
        System.out.println("Задайте колличество столбцов ");
        int j = in.nextInt();
        int matrix[][] = new int[i][j];
        int x;
        int y;
        for (x = 0; x < i; x++) {
            for (y = 0; y < j; y++) {
                System.out.println("Введите значение в  строке № "+x+", столбце № "+y );
                int n = in.nextInt();
                matrix[x][y]=3*n;
            }
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}
