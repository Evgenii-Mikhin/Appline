//Задача №16: Выгрузка данных из файла на экран
//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.FileInputStream;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("file.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());

            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}