import java.util.Scanner;

public class Task4 {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число в бинарном формате: ");
            String A = in.nextLine();
            int B = Integer.parseInt(A,2);
            System.out.println(B);
        }
    }

