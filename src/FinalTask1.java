//Итоговая задача №1
//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalTask1 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*Создается экземпляр класса BufferedReader, который считывает данные из создаваемого им буфера.
        Буфер на вход получает данные из потока. Поэтому мы создаем экземпляр класса InputStreamReader,который создает поток (канал).
        В InputStreamReader на вход нужно получать данные из консоли (введенные с клавиатуры), поэтоу создаем поток System.in.
        InputStreamReader получает данные и преобразует байты в символы.*/
        System.out.println("Введите число в бинарном формате");
        String str = reader.readLine();
        int n = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j =j*2) { // i - длинна строки введенной в консоль минус 1. (1-1=0, 2-1=1),
            // i больше либо равно нулю и цикл на уменьшение числа i (в каждой итерации i меньше на единицу, т.к обрабатываем бинарник справа налево). j начинается с 1 и в каждой следующей итерации цкла увеличиваеся в 2 раза
            n = n + (str.charAt(i) - '0') * j; // str.charAt(i) - получение числа с индексом номера i (которая является размером введенной в консоль строки) из введенной строки.
           // System.out.println("Число i:"+i);
           // System.out.println("Число j:"+j);
          // System.out.println("Число n:"+n);
        }
        System.out.println(n);
    }}