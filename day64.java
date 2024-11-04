package day64;
public class Main {
    public static void main(String[] args) {
        swad:
        for (int a = 1; a <= 5; a++) {
            System.out.println("a = " + a);
            
            if (a == 3) {
                System.out.println("Break pada a = " + a);
                break swad;
            }
        }
        System.out.println("Loop selesai.");
    }
}
