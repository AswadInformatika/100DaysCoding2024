public class TernaryExample {
    public static void main(String[] args) {
        int angka = 10;

        // Ternary operator untuk mengecek apakah angka genap atau ganjil
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}
