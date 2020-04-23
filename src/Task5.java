//Задача №5: Таблица умножения
//Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
import java.util.Scanner;

public class Task5 {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
    int a = in.nextInt();
        System.out.println(a+"*1= "+a*1);
        System.out.println(a+"*2= "+a*2);
        System.out.println(a+"*3= "+a*3);
        System.out.println(a+"*4= "+a*4);
        System.out.println(a+"*5= "+a*5);
        System.out.println(a+"*6= "+a*6);
        System.out.println(a+"*7= "+a*7);
        System.out.println(a+"*8= "+a*8);
        System.out.println(a+"*9= "+a*9);

    }
}

