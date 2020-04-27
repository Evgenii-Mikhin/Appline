//Задача №11: Ввод строки с клавиатуры
//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
import java.util.Scanner;
public class Task11 {
    public static void main(String args[]) {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String string= scanner.nextLine();
        System.out.println(string);

    }
}