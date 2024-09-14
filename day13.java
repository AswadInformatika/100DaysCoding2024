public class Main {
    public static void main(String[] args) {
        System.out.printf("Nama: %s", "Aswad");
        System.out.println();
        System.out.printf("Nim: %s", "D0224020");
        System.out.println();
        System.out.printf("Umur %d", 19);

       //deklarasi variabel itu penulisan tipe data tanpa memberikan nilai pada variabelnya
        /*inisialisasi itu pengisian nilai variabel yang sudah dibuat*/             
 
     final String nama = "Aswad"; 
  
        int a = 5;
        int b = 8;
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
   
        byte minimal = -128;
        byte maximal = 127;
        System.out.println(minimal);
        System.out.println(maximal + 1);
    }    
}
