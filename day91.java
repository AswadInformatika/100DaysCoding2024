package day;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Msukkan angka: ");
            int input = sc.nextInt();
            if (input % 2 == 0) {
                System.out.println(input + ": angka genap");
            }else if (input % 2 == 1) {
                System.out.println("You and I, END");
                break;
            }
        }
    }
}
