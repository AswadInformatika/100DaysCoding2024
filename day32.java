package valueof;
public class Main {
    public static void main(String[] args) {
        //konversi primitif ke string menggunakan Value Of itu method
        
        int a = 123; //konversi tipe data primitif bilangan bulat ke string
        String b = String.valueOf(a);

        System.out.println(b);
        
        char c = 'a'; //konversi tipe data char untuk satu karakter ke string
        String d = String.valueOf(c);
        System.out.println(d);
        
        boolean e = false; //konversi tipe data boolean ke string
        String f = String.valueOf(e);
        System.out.println(f);
        
        float g = 12.0f; //konversi tipe data primitif bilangan desimal ke string
        String h = String.valueOf(g);
        System.out.println(h);  
    }    
}
