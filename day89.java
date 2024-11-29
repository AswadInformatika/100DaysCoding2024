package day89;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kalimat : ");
        String kalimat = sc.nextLine();
        String ya = "";
        boolean huruf = true;
        
        for (int a = 0; a < kalimat.length(); a++) {
            char k = kalimat.charAt(a);

            if (k == ' ') {
                ya = ya + k; 
                huruf = true;
            } else {
                if (huruf) {
                    ya += Character.toUpperCase(k); 
                    huruf = false;
                } else {
                    ya += Character.toLowerCase(k); 
                }
            }
        }
        System.out.println(ya);
    }
}
