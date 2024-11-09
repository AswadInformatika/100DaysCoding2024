//soal 1
package evaluasimentor3;
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char batas = sc.next().charAt(0);
        char skip = sc.next().charAt(0);
        for(char i = 'A'; i<= batas; i++){
            if (i == skip){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

//soal4
package evaluasimentor3;
import java.util.Scanner;
public class Soal4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan angka akhir: ");
        int akhir = sc.nextInt();
        int ganjil = 0;
        int genap = 0;
        for(int i = awal; i <= akhir; i++){
            if(i % 2 == 0){
                genap++;
            }else{
                ganjil++;
            }
        }
        System.out.println("Dalan rentang "+ awal + " sampai "+ akhir);
        System.out.println("Jumlah bilangan genap "+ genap);
        System.out.println("Jumlah bilangan ganjil "+ ganjil);
    }
}

//soal5
package evaluasimentor3;
import java.util.Scanner;
public class Soal5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double jumlah = 0;
        while(true){
            System.out.println("Masukkan nilai: ");
            int nilai = sc.nextInt();
            if(nilai > 0){
                jumlah++;
            }else{
                break;
            }
            total += nilai;
        }
        System.out.println("Total nilai "+ total);
        double rata = total / jumlah;
        System.out.printf("Rata-rata nilai %.2f", rata);
    }
}
