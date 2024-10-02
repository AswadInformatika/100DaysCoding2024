package konversi;
public class Main {
    public static void main(String[] args) {
        
        //konversi tipe data string ke tipe data primitif menggunakan parse
        //parse itu termasuk mehtod karena ada buka dan tutup kurung ()
        
        String ab = "12"; //deklarasi dan inisialisasi variabel dan tipe data string
        
        int ca = Integer.parseInt(ab);
        System.out.println(ca);
        
        byte c = Byte.parseByte(ab);

        System.out.println(c);
        
        short d = Short.parseShort(ab);

        System.out.println(d);
        
        long e = Long.parseLong(ab);
        System.out.println(e);
        
        float f = Float.parseFloat(ab);

        System.out.println(f);
        
        double g = Double.parseDouble(ab);
        System.out.println(g);
        
        String nama = "Aswad";
        char h = nama.charAt(1);
        System.out.println(h);
        
        String status = "true";
        boolean i = Boolean.parseBoolean(status);
        System.out.println(i);
        
    }
}
