package day51;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.println("Pilih angka dari 1 hingga 3:");
        int pilihan = isc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Memilih angka 1");
                break;
            case 2:
                System.out.println("Memilih angka 2");
                break;
            case 3:
                System.out.println("Memilih angka 3");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
