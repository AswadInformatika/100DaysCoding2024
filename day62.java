import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batas = 0;
        System.out.print("Masukkan angka maksimum: ");
        int max = sc.nextInt();
        while(true){
            System.out.print("Masukkan angka berikutnya: ");
            int angka = sc.nextInt();
            batas += angka;
            if(batas > max){
                break;
            }
        }
        System.out.println(batas);
    }
}￼Enter
