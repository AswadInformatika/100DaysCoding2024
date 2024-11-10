package day70;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int awal = sc.nextInt();
        System.out.print("Batas: ");
        int batas = sc.nextInt();
        if(awal == 2){
            cetak(batas);
        }else if(awal == 1){
            print(batas);
        }
    }
   static void cetak(int batas){
       for(int i = 2; i <= batas; i+=2){
           System.out.println(i);
       }
    }
    static void print(int batas){
        for(int a = 1; a <= batas; a+=2){
            System.out.println(a);
        }
     }
  }
