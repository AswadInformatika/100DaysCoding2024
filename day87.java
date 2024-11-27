package latihan;
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

        while (true) {  
            System.out.println("\nPilih: ");
            System.out.println("1. Menampilkan");
            System.out.println("2. Mengubah");
            System.out.print("Masukkan pilihan: ");
            int c = sc.nextInt();
            sc.nextLine(); 
            if (c == 1) {
                System.out.println("Pilih yang ingin dicetak:");
                System.out.println("1. Nama");
                System.out.println("2. Jurusan");
                System.out.println("3. Alamat");
                System.out.print("Masukkan pilihan: ");
                int p = sc.nextInt();

                String cetak = (p == 1) ? "Nama: " + bio[0] :(p == 2) ? "Jurusan: " + bio[1] :(p == 3) ? "Alamat: " + bio[2] :"Egee!";
                System.out.println(cetak);
            } else if (c == 2) {
                System.out.println("Pilih yang ingin diubah:");
                System.out.println("1. Nama");
                System.out.println("2. Jurusan");
                System.out.println("3. Alamat");
                System.out.print("Masukkan pilihan: ");
                int p = sc.nextInt();
                sc.nextLine();

                switch (p) {
                    case 1:
                        System.out.print("Masukkan nama baru: ");
                        bio[0] = sc.nextLine();
                        System.out.println("Nama diubah menjadi: " + bio[0]);
                        break;
                    case 2:
                        System.out.print("Masukkan jurusan baru: ");
                        bio[1] = sc.nextLine();
                        System.out.println("Jurusan diubah menjadi: " + bio[1]);
                        break;
                    case 3:
                        System.out.print("Masukkan alamat baru: ");
                        bio[2] = sc.nextLine();
                        System.out.println("Alamat diubah menjadi: " + bio[2]);
                        break;
                    default:
                        System.out.println("Egee!");
                        break;
                }
            
            }
            System.out.println("\nPilih lanjut atau berhenti?");
            System.out.print("ya / tidak: ");
            String yt = sc.nextLine();
            if(yt.equalsIgnoreCase("ya")){
                
            }else if(yt.equalsIgnoreCase("tidak")){
                break;
            }
        }
    }
}
