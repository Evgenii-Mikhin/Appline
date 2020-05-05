//Задача №15: Сортировка данных в массиве
//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//Использовать пузырьковый метод сортировки.

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размер массива ");
        int i = in.nextInt();
        int[] arr = new int[i];
        int j;
        for (j = 0; j < i; j++) {
            System.out.println("введи значение элемента массив с номером " + j);
            int n = in.nextInt();
            arr[j]=n;
        }

        for ( j = arr.length - 1; j > 0; j--) {
            for (int m = 0; m < j; m++) {

                if (arr[m] > arr[m + 1]) {
                    int tmp = arr[m];
                    arr[m] = arr[m + 1];
                    arr[m + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}