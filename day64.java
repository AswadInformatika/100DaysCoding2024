package day64;
public class Main {
    public static void main(String[] args) {
        oneLoop:
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            
            if (i == 3) {
                System.out.println("Break pada i = " + i);
                break oneLoop;
            }
        }
        System.out.println("Loop selesai.");
    }
}
