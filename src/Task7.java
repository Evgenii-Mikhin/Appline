//Задача №7: Условие вывода данных
//Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
// В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение
// "Данное значение имеется в константах" если number=X или Y или Z. Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        int x = 1;
        int y = 3;
        int z = 5;
        switch (number) {
            case 1:
                System.out.println("Данное значение имеется в константах");
                break;
            case 3:
                System.out.println("Данное значение имеется в константах");
                break;
            case 5:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
        }
        }


}