//Задание №9: Ввод/вывод данных для массива
//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
// где каждый элемент массива умножается на 2. Размер массива задается пользователем.

import java.util.Arrays;
import java.util.Scanner;
public class Task9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размер массива ");
        int i = in.nextInt();
        int[] nums = new int[i];
        int j;
        for (j=0; j<i; j++) {
            System.out.println("введи значение элемента массив с номером "+j);
            int n =in.nextInt();
            nums[j]=2*n;
        }
        System.out.println(Arrays.toString(nums));


    }
}