//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
//Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
//(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

import java.util.Scanner;
public class FinalTask3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double a = in.nextDouble();
        System.out.println("Введите количество рублей: ");
        int rub = in.nextInt();
        double b =rub/a;
        System.out.printf("Итого долларов: %.2f %n", b);
    }

}
