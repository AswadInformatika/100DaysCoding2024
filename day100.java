import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = in.nextLine();

        LocalTime waktu = LocalTime.now();
        LocalTime terbit = LocalTime.of(6, 0);
        LocalTime pagi = LocalTime.of(11, 59);
        LocalTime siang = LocalTime.of(12, 0);
        LocalTime sore = LocalTime.of(16, 59);
        LocalTime malam = LocalTime.of(17, 0);
        String salam;

        if (waktu.isAfter(terbit) && waktu.isBefore(pagi)) {
            salam = "Selamat Pagi";
        } else if (waktu.isAfter(siang) && waktu.isBefore(sore)) {
            salam = "Selamat Siang";
        } else if (waktu.isAfter(malam)) {
            salam = "Selamat Malam";
        } else {
            salam = "Selamat Malam";
        }

        System.out.println("==============================");
        System.out.println("   " + salam + ", " + nama);
        System.out.println("   Program Anda telah selesai");
        System.out.println("==============================");
    }
}
