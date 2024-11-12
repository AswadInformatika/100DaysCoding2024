package day72;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        int faktorial = f(nilai);
        System.out.println("Hasil faktorial = " + faktorial);
    }

    static int f(int a) {
        System.out.println("Nilai = "+a);
        if (a == 1) {
            return a;
        }
        return a * f(a - 1);
    }
}
￼Enter
