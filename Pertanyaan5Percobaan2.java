public class Pertanyaan5Percobaan2 {
    }public static void ubahNama(String nama) {
    nama = "Tamu";
    System.out.println("Di dalam fungsi: " + nama);
}
public static void main(String[] args) {
    String nama = "Andi";
    ubahNama(nama);
    System.out.println("Di main: " + nama);
}