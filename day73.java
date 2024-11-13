package day73;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan indeks: ");
        int indeks = sc.nextInt();

        char huruf = nama.charAt(indeks);
        System.out.println("Indeks ke " + indeks + " adalah huruf: " + huruf);
        
    }
}
