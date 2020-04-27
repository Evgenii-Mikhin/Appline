//Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
// Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
import java.util.Scanner;
public class Task13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст (1):");
            String string1 = scanner.nextLine();
            System.out.println("Введите текст (2):");
            String string2 = scanner.nextLine();
            int a = string1.length();
            int b = string2.length();
            if (a > b) {
                System.out.println(string1);
            }
            if (a < b) {
                System.out.println(string2);
            }
            else {
                System.out.println("Размер строк равен");
            }
        }
    }
    }