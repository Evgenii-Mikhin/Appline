//Задача №18: Выгрузка данных из файла, проверка и перезапись
//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
// Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        try {
            File file = new File("Task18.txt");
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                int linenumber = 0;
                while (lnr.readLine() != null) {
                    linenumber++;
                }
            //  System.out.println("Total number of lines : " + linenumber);
                try (FileInputStream fin = new FileInputStream("Task18.txt")) {
                    System.out.println("Данные из файла Task18.txt");
                    System.out.printf("", fin.available());
                    int i = -1;
                    while ((i = fin.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                String str;
                BufferedReader br =
                        new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Построчно введите исправления");
                System.out.println("Количество строк должно соответсвовать "+ linenumber);
                try (FileWriter fw = new FileWriter("Task18.txt"))
                {
                    for (int countline=1; countline<=linenumber;countline++ ) {
                        // System.out.println("Введите текст :");
                        str = br.readLine();
                        if (str.compareTo("stop") == 0) break;
                        str = str + "\r\n";
                        fw.write(str);
                    }
                } catch (IOException exc) {
                    System.out.println("Ощибка файла!" + exc);
                }lnr.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}