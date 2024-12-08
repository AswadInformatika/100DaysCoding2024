import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = sc.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = sc.nextInt();
        int total = 0;
        for(int i = x; i<=y; i++){
            if(i % 2 == 0){
              total += i;  
            }
        }System.out.println(total);
    }
}
