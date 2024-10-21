package day50;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = isc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = isc.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int c = isc.nextInt();
        if(a > b && a > c){
            System.out.println("Angka terbesar adalah " + angkaPertama);
        }else if(b > a && b > c){
            System.out.println("Angka terbesar adalah " + angkaKedua);
        }else{
            System.out.println("Angka terbesar adalah " + angkaKetiga);
        }  
    }
}
