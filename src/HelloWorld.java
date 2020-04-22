/*public class HelloWorld {
    //Михин Евгений. Первая программа
        public static void main(String[] args) {
            System.out.println("Hello, world!");
             } */
//Задача №4: Отработка поразрядных операцийЗадание
//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.

import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число в бинарном формате: ");
        String A = in.nextLine();
        int B = Integer.parseInt(A,2);
        System.out.println(B);

    }
}