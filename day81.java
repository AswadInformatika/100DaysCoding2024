package day81;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih angka 1-4: ");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("1. int");
                System.out.print("Masukkan angka: ");
                int angka = sc.nextInt();
                String nomor = String.valueOf(angka);
                System.out.println("Hasil: " + nomor);
                break;
            case 2:
                System.out.println("2. boolean");
                System.out.print("Masukkan status: ");
                boolean bo = sc.nextBoolean();
                String status = String.valueOf(bo);
                System.out.println("Hasil: " + status);
                break;
            case 3:
                System.out.println("3. float");
                System.out.print("Masukkan angka: ");
                float flo = sc.nextFloat();
                String koma = String.valueOf(flo);
                System.out.println("Hasil: " + koma);
                break;
            case 4:
                System.out.println("4. char");
                System.out.print("Masukkan huruf: ");
                char huruf = sc.next().charAt(0);
                String inisial = String.valueOf(huruf);
                System.out.println("Hasil: " + inisial);
                break;
        }
    }
}
