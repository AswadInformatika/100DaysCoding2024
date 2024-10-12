import java.math.BigInteger;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama ");
        BigInteger a = isc.nextBigInteger();
        
        System.out.print("Masukkan angka kedua ");
        BigInteger b = isc.nextBigInteger();
        System.out.println("Penjumlahan " + a.add(b));
        System.out.println("Pengurangan " + a.subtract(b));
        System.out.println("Pembagian " + a.divide(b));
        System.out.println("Perkalian " + a.multiply(b));
//soal2
        System.out.print("Inputan pertama ");
        String a = isc.nextLine();
        System.out.print("Inputan kedua ");
        String b = isc.nextLine();
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        System.out.println(c + d);
//soal3
        System.out.print("Masukkan panjang ");
        int panjang = isc.nextInt();
        System.out.print("Masukkan lebar ");
        int lebar = isc.nextInt();
        System.out.println("Luas " + panjang * lebar);
        System.out.println("Keliling " + 2 * (panjang + lebar));
//soal4
        int a = 20;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
//soal5
       int a = isc.nextInt();
       int b = isc.nextInt();
       int hasil = a * b;
       System.out.println(hasil * hasil * hasil);
    }
}
