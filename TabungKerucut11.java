import java.util.Scanner;
public class TabungKerucut11 {
    public static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }
    public static double volumeTabung(double r, double t) {
        return luasLingkaran(r) * t;
    }
    public static double luasPermukaanTabung(double r, double t) {
        return 2 * luasLingkaran(r) + 2 * Math.PI * r * t;
    }
    public static double volumeKerucut(double r, double t) {
        return volumeTabung(r, t) / 3;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double r, t;
        do {
            System.out.println("\n===== MENU PERHITUNGAN =====");
            System.out.println("1. Luas Lingkaran");
            System.out.println("2. Volume Tabung");
            System.out.println("3. Luas Permukaan Tabung");
            System.out.println("4. Volume Kerucut");
            System.out.println("0. Keluar");
            System.out.print("Pilih perhitungan: ");
            pilihan = input.nextInt();

            if (pilihan == 0) {
                System.out.println("Program selesai.");
            } else if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan jari-jari: ");
                r = input.nextDouble();
                if (pilihan == 1) {
                    System.out.println("Luas lingkaran: " + luasLingkaran(r));
                } else {
                    System.out.print("Masukkan tinggi: ");
                    t = input.nextDouble();
                    if (pilihan == 2) {
                        System.out.println("Volume tabung: " + volumeTabung(r, t));
                    } else if (pilihan == 3) {
                        System.out.println("Luas permukaan tabung: " + luasPermukaanTabung(r, t));
                    } else if (pilihan == 4) {
                        System.out.println("Volume kerucut: " + volumeKerucut(r, t));
                    }
                }
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 0);
        input.close();
    }
}