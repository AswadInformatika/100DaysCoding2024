package day49;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = isc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = isc.nextInt();
        if(a > b){
            System.out.println("Angka terbesar adalah " + a);
        }else if(b < a){
            System.out.println("Angka terbesar adalah " + b);
        }  
    }
}
