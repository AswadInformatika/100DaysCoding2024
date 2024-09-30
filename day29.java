package day29;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
      //tipe data BigInteger adalah tipe data non primitif yang menggunakan import java.math.BigInteger;
      //tipe data BigInteger nilainya hampir tidak dibatasi sedangkan integer dibatasi
        BigInteger a = new BigInteger("1000000");
        BigInteger b = new BigInteger("100000");
        System.out.println("Big Integer: " + a);
        System.out.println("Big Integer: " + b);
       
        // Operasi penjumlahan
        BigInteger sum = a.add(b);
        System.out.println("Sum atau penjumlahan: " + sum);

        // Operasi pengurangan
        BigInteger difference = a.subtract(b);
        System.out.println("Difference atau pengurangan: " + difference);
        
        // Operasi perkalian
        BigInteger product = a.multiply(b);
        System.out.println("Product atau perkalian: " + product);
        
        // Operasi pembagian
        BigInteger quotient = a.divide(b);
        System.out.println("Quotient atau pembagian: " + quotient)
         }
}
