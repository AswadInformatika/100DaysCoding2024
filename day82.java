package day82;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double d = sc.nextDouble();

        double c = Math.ceil(d); 
        System.out.println("Math.ceil: " + c);

        long r = Math.round(d); 
        System.out.println("Math.round: " + r);

        double f = Math.floor(d); 
        System.out.println("Math.floor: " + f);
    }
}
