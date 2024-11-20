package day80;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine().trim();
            if (nama.length() > 0) {
                break;
            }
            System.out.println("Nama tidak boleh kosong. Silakan coba lagi.");
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
