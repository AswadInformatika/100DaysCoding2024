package day33;
public class Main {
    public static void main(String[] args) {
        //type casting: mengubah tipe data primitif ke primitif
        
        //konversi otomatis: tipe data kecil diubah menjadi tipe data yang lebih besar.
        byte angka = 100;
        short pendek = angka;       // byte ke short
        System.out.println(pendek);
        int bilangan = pendek;     // short ke int
        System.out.println(bilangan);
        long panjang = bilangan;  // int ke long
        System.out.println(panjang);
        float koma = panjang;    // long ke float
        System.out.println(koma);
        double desimal = koma;  // float ke double
        System.out.println(desimal);
        
        //konversi manual: tipe data besar di ubah ke tipe data kecil
        double d = 10.9;
        float f = (float)d;     // double ke float
        System.out.println(f);
        long l = (long)f;      // float ke long
        System.out.println(l);
        int i = (int)l;       // long ke int
        System.out.println(i);
        short s = (short)i;  // int ke short
        System.out.println(s);
        byte b = (byte)s;   // short ke byte
        System.out.println(b);
    }
}
