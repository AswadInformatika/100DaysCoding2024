public class Main {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Pola Persegi:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int c = 3;
        int d = 7;
        System.out.println("Pola Persegi Panjang:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
