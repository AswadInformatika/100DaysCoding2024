package day48.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai ");
        int nilai = input.nextInt();
        if(nilai >= 80){
            System.out.println("Lulus ");
        }else{
            System.out.println("Mengulang ");
        }
    }   
}
