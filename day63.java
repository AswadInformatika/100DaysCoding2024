public class Main {
    public static void main(String[] args) {
        int totalG = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
            totalG += i;
        }
        System.out.println();
        System.out.println("Total bilangan genap: " + totalG);
    }
}
