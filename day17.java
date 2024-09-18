package day17;
public class Main { 
    public static void main(String[] args) {
        final char d = 'd';
        //variabel konstanta atau final
        //tipe data char untuk 1 karakter dan dalam petik 1
        //seperti 'a' , 'A' , '1' 
        char a = 'a';
        char b = 'b';
        //update
        b = 'c';    
        char c = a;
        //update
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        //menampilkan
    }
}
