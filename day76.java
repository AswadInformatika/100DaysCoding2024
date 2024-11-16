import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        for (int i = 1; i <= 5; i++){
            System.out.println(nama.toUpperCase());
        }
    }
}
