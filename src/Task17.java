//Задача №17: Запись данных в файл
//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

import java.io.*;
        import java.io.IOException;

public class Task17 {
    public static void main(String args[]) {
        String str;
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для завершения ввода текста введите 'stop'");
        try (FileWriter fw = new FileWriter("Task17.txt")) {
            do {
                System.out.println("Введите текст :");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Алярм" + exc);
        }


    }
}
