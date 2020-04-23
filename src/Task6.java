//Задача №6: Отработка арифметических операций
//Написать программу, которая будет выполнять следующие действия:
//1. Ввод трех чисел с клавиатуры x, y, z
//2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
//3. Деление среднего арифметического на 2 без остатка
//4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
import java.util.Scanner;
public class Task6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        float x= in.nextInt();
        System.out.println("Введите число 2:");
        float y= in.nextInt();
        System.out.println("Введите число 3:");
        float z= in.nextInt();
        double c=(x+y+z)/3;
        System.out.println("Среднее арифметическое:"+c);
        double src = c/2;
        int d= (int)src;
       // System.out.println(d);
        if (d>3){
        System.out.println("Программа выполнена корректно");
        } /*else {
            System.out.println("Не успешно");
        } */

    }
}
