import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bio = new String[3];
        System.out.print("Masukkan nama: ");
        bio[0] = sc.nextLine();
        System.out.print("Masukkan jurusan: ");
        bio[1] = sc.nextLine();
        System.out.print("Masukkan alamat: ");
        bio[2] = sc.nextLine();
        
        System.out.println("Pilih yang ingin dicetak:");
        System.out.println("1. Nama");
        System.out.println("2. Jurusan");
        System.out.println("3. Alamat");
        System.out.print("Masukkan pilihan (1-3): ");
        int p = sc.nextInt();
        
        String cetak = (p == 1) ? "Nama: " + bio[0]: (p == 2) ? "Jurusan: " + bio[1]: (p == 3) ? "Alamat: " + bio[2]: "Egee!";
        System.out.println(cetak);     
    }
}
