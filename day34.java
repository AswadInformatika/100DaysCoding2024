package day34;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //menginput dari keyboard menggunakan Scanner
        Scanner wad = new Scanner(System.in);
        System.out.print("Masukkan nama ");
        String nama = wad.nextLine();
        
        System.out.print("Masukkan NIM ");
        String nim = wad.nextLine();
        
        System.out.print("Masukkan umur ");
        int umur = wad.nextInt();
        wad.nextLine();
        
        System.out.print("Masukkan alamat ");
        String alamat = wad.nextLine();
        
        System.out.print("Masukkan kelas ");
        char kelas = wad.next().charAt(0);
        
        System.out.print("Masukkan Berat Badan ");
        float bb = wad.nextFloat();
        
        System.out.print("Masukkan Tinggi Badan ");
        double tb = wad.nextDouble();
        wad.nextLine();
        
        System.out.print("Pesan & Kesan? ");
        String pk = wad.nextLine();
        
        System.out.print("Motivasi: ");
        String motivasi = wad.nextLine();
        
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Umur : " + umur + " Tahun");
        System.out.println("Alamat : " + alamat);
        System.out.println("Kelas : " + kelas + " Informatika");
        System.out.println("Berat Badan : " + bb + " kg");
        System.out.println("Tinggi Badan : " + tb + " cm");
        System.out.println("Pesan dan Kesan : " + pk);
        System.out.println("Motivasi : " + motivasi);
    }
}
