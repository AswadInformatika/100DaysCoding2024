package day67;
public class Main {
    String nama = "Aswad";         
    int usia = 19;                  
    String jurusan = "Informatika"; 

    public static void main(String[] args) {
        Main identitas = new Main();
        identitas.identitas();
    }

    // Method void
    void identitas() {
        // Menampilkan identitas
        System.out.println("Identitas:");
        System.out.println("Nama    : " + nama);
        System.out.println("Usia    : " + usia + " tahun");
        System.out.println("Jurusan : " + jurusan);
    }
}
