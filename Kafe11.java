import java.util.Scanner;
public class Kafe11 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("========================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga11(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        if (pilihanMenu < 1 || pilihanMenu > 6) {
        System.out.println("Menu tidak tersedia");
        return 0;
    }
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = total * 50 / 100;
        } else if (kodePromo.equals("DISKON30")) {
            diskon = total * 30 / 100;
        } else {
            System.out.println("Kode promo invalid");
        }
        if (isMember) {
            diskon += total * 10 / 100;
        }
        return diskon;
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi", true);

        int totalBayar = 0;
        char tambahPesanan;

        do {
            System.out.print("\nMasukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            totalBayar += hitungTotalHarga11(pilihanMenu, banyakItem);

            System.out.print("Tambah pesanan? (y/n): ");
            tambahPesanan = sc.next().charAt(0);
        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        boolean isMember = true;
        int diskon = hitungDiskon(totalBayar, kodePromo, isMember);
        int totalAkhir = totalBayar - diskon;

        System.out.println("Total harga: Rp" + totalBayar);
        System.out.println("Besar diskon: Rp" + diskon);
        System.out.println("Total yang harus dibayar: Rp" + totalAkhir);
        sc.close();
    }
}