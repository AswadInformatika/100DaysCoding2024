package day80;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        while (true) {
            System.out.print("Masukkan nama dan tidak boleh kosong: ");
            nama = scanner.nextLine().trim();
            if (nama.length() > 0) {
                break;
            }
            System.out.println("Nama tidak boleh kosong. Coba lagi.");
        }

        cekNama(nama);
    }

    public static void cekNama(String nama) {
        if (nama.length() <= 5) {
            System.out.println(nama +" nama yang singkat");
        } else {
            System.out.println(nama + " nama yang panjang");
        }
    }
}
