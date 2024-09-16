
public class Main {
    
    public static void main(String[] args) {
        double angka = 7.2836482977;
        //tipe data double untuk menampung bilangan berkoma lebih besar dari float
        System.out.printf("%.1f\n", angka);
        System.out.printf("%.2f\n", angka);
        System.out.printf("%.3f\n", angka);
        System.out.printf("%.4f\n", angka);
        System.out.printf("%.5f\n", angka);
        //format %.1f untuk mencetak satu angka sesudah koma	
        //format %.2f untuk mencetak dua angka sesudah koma dan seterusnya
        //\n untuk enter
        
        System.out.println(String.format("%.6f", angka));
        System.out.println(String.format("%.7f", angka));
        System.out.println(String.format("%.8f", angka));
        System.out.println(String.format("%.9f", angka));
        System.out.println(String.format("%.10f", angka));
        //formatnya sama, kalau menggunakan println di tambahkan (String.format)
    }  
}
