//Задача №14: Преобразование типов
//Необходимо написать программу, которая будет реализовывать следующие действия:
//1. Ввод числа с клавиатуры и запись его в строковую переменную S
//2. Конвертация строковой переменной S в числовую переменную X типа int
//3. Конвертация числа X типа int в число Y типа double
//Все три числа разных типов необходимо в столбик вывести на экран
import java.util.Scanner;
public class Task14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Задайте значение: S = ");
            String S = scanner.nextLine();
            System.out.println("S ="+S);
            int X = Integer.parseInt(S.trim());
            System.out.println("X ="+X);
            double Y = X;
            System.out.println("Y ="+Y);
    }
}}