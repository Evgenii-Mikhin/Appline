//Задача №12: Удаление всех пробелов в заданном тексте
//Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
import java.util.Scanner;
public class Task12 {
    public static void main(String args[]) {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String string2 = string.replaceAll(" ", "");
        System.out.println(string2);
    }
}
