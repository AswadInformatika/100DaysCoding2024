package day61;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bom = 50;
        int awal = 0;
        int akhir = 100;
        boolean meledak = false;
        while(!meledak) {
            System.out.print("Masukkan angka " + awal + " - " + akhir + " : ");
            int angka = sc.nextInt();

            if (angka >= awal && angka <= akhir) {
                if (angka == bom) {
                    System.out.println("Duarrrrr");
                    meledak = true; 
                } else if (angka < bom) {
                    awal = angka; 
                } else {
                    akhir = angka; 
                }
            } else {
                System.out.println("Tidak boleh melewati batas");
            }
        }
    }
}
