import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        String nim = sc.nextLine();
        if(nama.equalsIgnoreCase("Aswad") && nim.equalsIgnoreCase("D0224020")){
            System.out.println("Berhasil");
            break;
        }else{
            System.out.println("Coba lagi");
        }
        } 
    }
}
