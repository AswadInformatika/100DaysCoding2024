import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();
        
        System.out.println("Bilangan prima dari 1 hingga " + n + ":");

        for (int m = 2; m <= n; m++) {
            boolean p = true;

            for (int i = 2; i <= m / 2; i++) {
                if (m % i == 0) {
                    p = false;
                    break;
                }
            }

            if (p) {
                System.out.print(m + " ");
            }
        }
    }
}
