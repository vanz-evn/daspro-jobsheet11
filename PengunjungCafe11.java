
public class PengunjungCafe11 {

    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("\nDaftar Pengunjung Meja " + nomorMeja + ":");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int nilai : harga) {
            total += nilai;
        }
        return total;
    }
    public static void main(String args[]) {
        daftarPengunjung(1, "Ali", "Budi", "Citra");
        daftarPengunjung(2, "Andi");
        daftarPengunjung(3, "Doni", "Eti", "Fahmi", "Galih");

        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(4, tamu);

        int total1 = hitungTotalBelanja(15000);
        int total3 = hitungTotalBelanja(15000, 20000, 10000);
        int total5 = hitungTotalBelanja(10000, 15000, 20000, 12000, 18000);

        System.out.println("\nTotal 1 harga: Rp" + total1);
        System.out.println("Total 3 harga: Rp" + total3);
        System.out.println("Total 5 harga: Rp" + total5);
    }
}