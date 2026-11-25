import java.util.Scanner;
public class BankSampah11 {
    static Scanner input = new Scanner(System.in);
    public static double[] inputSetoran(int n) {
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = input.nextDouble();
        }
        return setoran;
    }
    public static void tampilSetoran(double[] setoran) {
        System.out.println("\n===== DATA SETORAN NASABAH =====");
        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": " + setoran[i] + " kg");
        }
    }
    public static double totalSetoran(double[] setoran) {
        double total = 0;
        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }
        return total;
    }
    public static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }
    public static int nasabahTerbanyak(double[] setoran) {
        int indeksTerbesar = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[indeksTerbesar]) {
                indeksTerbesar = i;
            }
        }
        return indeksTerbesar;
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah nasabah: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Jumlah nasabah harus lebih dari 0.");
            input.close();
            return;
        }
        double[] setoran = inputSetoran(n);
        tampilSetoran(setoran);
        double total = totalSetoran(setoran);
        System.out.println("\nTotal seluruh setoran: " + total + " kg");
        double hargaPerKg = 3000;
        System.out.println("\n===== SALDO NASABAH =====");
        for (int i = 0; i < n; i++) {
            double saldo = hitungSaldo(setoran[i], hargaPerKg);
            System.out.println("Saldo nasabah ke-" + (i + 1) + ": Rp" + saldo);
        }
        int indeksTerbesar = nasabahTerbanyak(setoran);
        System.out.println("\nNasabah dengan setoran terbanyak adalah nasabah ke-" + (indeksTerbesar + 1));
        System.out.println("Berat setoran: " + setoran[indeksTerbesar] + " kg");
        input.close();
    }
}