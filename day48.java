package day48.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tahun Umur ");
        int tahun = input.nextInt();
        int umur = 2024 - tahun;
        if(umur >= 12 && umur <= 25){
            System.out.println("Umur " + umur + " Remaja");
        }if(umur > 25){
            System.out.println("Umur " + umur + " Dewasa");
        }else{
            System.out.println("Umur " + umur + " Kanak-kanak");
        }
    }
}
