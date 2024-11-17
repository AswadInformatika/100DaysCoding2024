import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        String nim = sc.nextLine();
        if(nama.equals("Aswad") && nim.equals("D0224020")){
            System.out.println("Terdaftar");
            break;
        }else if(nama.equals("Aswad")){
            System.out.println("Nim salah");
        }else if(nim.equals("D0224020")){
            System.out.println("Nama salah");
        }else{
            System.out.println("Tidak terdaftar");
        }
        } 
    }
}
