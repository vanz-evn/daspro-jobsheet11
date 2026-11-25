import java.util.Scanner;
public class RekapLaundry11 {
    public static void inputData(Scanner input, int[][] data, String[] namaLayanan, String[] namaHari) {
        System.out.println("\n===== INPUT DATA BERAT CUCIAN =====");
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nLayanan: " + namaLayanan[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Masukkan berat hari " + namaHari[j] + ": ");
                data[i][j] = input.nextInt();
            }
        }
    }
    public static void tampilData(int[][] data, String[] namaLayanan, String[] namaHari) {
        System.out.println("\n===== TABEL REKAP LAUNDRY =====");
        System.out.print("Layanan\t\t");
        for (int j = 0; j < namaHari.length; j++) {
            System.out.print(namaHari[j] + "\t");
        }
        System.out.println("Total");
        for (int i = 0; i < data.length; i++) {
            System.out.print(namaLayanan[i] + "\t");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println(totalPerLayanan(data, i));
        }
    }
    public static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }
    public static void layananTerbesar(int[][] data, String[] namaLayanan) {
        int indeksTerbesar = 0;
        int totalTerbesar = totalPerLayanan(data, 0);
        for (int i = 1; i < data.length; i++) {
            int total = totalPerLayanan(data, i);
            if (total > totalTerbesar) {
                totalTerbesar = total;
                indeksTerbesar = i;
            }
        }
        System.out.println("\n===== LAYANAN TERBANYAK =====");
        System.out.println("Nama layanan: " + namaLayanan[indeksTerbesar]);
        System.out.println("Total berat: " + totalTerbesar + " kg");
    }
    public static int hariTersibuk(int[][] data) {
        int indeksHari = 0;
        int totalTerbesar = 0;
        for (int j = 0; j < data[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }
            if (totalHari > totalTerbesar) {
                totalTerbesar = totalHari;
                indeksHari = j;
            }
        }
        return indeksHari;
    }
    public static void tampilPendapatan(int[][] data, String[] namaLayanan, int[] hargaPerKg) {
        int totalPendapatan = 0;
        System.out.println("\n===== PENDAPATAN LAUNDRY =====");

        for (int i = 0; i < data.length; i++) {
            int totalKg = totalPerLayanan(data, i);
            int pendapatan = totalKg * hargaPerKg[i];
            System.out.println(namaLayanan[i] + ": Rp" + pendapatan);
            totalPendapatan += pendapatan;
        }
        System.out.println("Total pendapatan selama 6 hari: Rp" + totalPendapatan);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaLayanan = {
            "Cuci Kering",
            "Cuci Setrika",
            "Setrika Saja",
            "Express"
        };
        int[] hargaPerKg = {
            6000, 8000, 5000, 12000
        };
        String[] namaHari = {
            "Senin", "Selasa", "Rabu",
            "Kamis", "Jumat", "Sabtu"
        };
        int[][] data = new int[4][6];

        inputData(input, data, namaLayanan, namaHari);
        tampilData(data, namaLayanan, namaHari);
        layananTerbesar(data, namaLayanan);
        int hari = hariTersibuk(data);
        System.out.println("\nHari tersibuk: " + namaHari[hari]);
        tampilPendapatan(data, namaLayanan, hargaPerKg);

        input.close();
    }
}