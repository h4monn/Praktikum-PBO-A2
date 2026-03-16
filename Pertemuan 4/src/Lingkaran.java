/*
 * File     : Lingkaran.java
 * Deskripsi : Kelas Lingkaran untuk menyimpan informasi tentang lingkaran
 * Pembuat  : Axel Purba - 24060124140127
 * Tanggal   : 9 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran (double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public  double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return Math.PI * (2 * jari);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari" + getJari());
    }
}
