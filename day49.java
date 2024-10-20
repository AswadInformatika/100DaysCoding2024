package day49;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = isc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = isc.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int angkaKetiga = isc.nextInt();
        if(angkaPertama > angkaKedua && angkaPertama > angkaKetiga){
            System.out.println("Angka terbesar adalah " + angkaPertama);
        }else if(angkaKedua > angkaPertama && angkaKedua > angkaKetiga){
            System.out.println("Angka terbesar adalah " + angkaKedua);
        }else{
            System.out.println("Angka terbesar adalah " + angkaKetiga);
        }  
    }
}
