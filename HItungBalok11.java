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
        // Balok pertama
    int p1 = 4, l1 = 3, t1 = 5;
    System.out.println("Balok Pertama");
    System.out.println("Luas Permukaan: " + hitungLuasPermukaanBalok(p1, l1, t1));
    System.out.println("Volume: " + hitungVolume(t1, p1, l1));

    // Balok kedua
    int p2 = 6, l2 = 4, t2 = 2;
    System.out.println("\nBalok Kedua");
    System.out.println("Luas Permukaan: " + hitungLuasPermukaanBalok(p2, l2, t2));
    System.out.println("Volume: " + hitungVolume(t2, p2, l2));

    // Balok ketiga
    int p3 = 5, l3 = 3, t3 = 7;
    System.out.println("\nBalok Ketiga");
    System.out.println("Luas Permukaan: " + hitungLuasPermukaanBalok(p3, l3, t3));
    System.out.println("Volume: " + hitungVolume(t3, p3, l3));
    }
}