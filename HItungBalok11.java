import java.util.Scanner;
public class HItungBalok11 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        int luas = 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
        return luas;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();
        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume Balok adalah " + vol);
        input.close();
    }
}