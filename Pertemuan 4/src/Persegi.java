/*
 * File     : Persegi.java
 * Deskripsi : Kelas Persegi untuk menyimpan informasi tentang persegi
 * Pembuat  : Axel Purba - 24060124140127
 * Tanggal  : 9 Maret 2026
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo () {
        System.out.println("Jumlah Sisi" + getJmlSisi());
        System.out.println("warna" + getWarna());
        System.out.println("Border" + getBorder());
        System.out.println("Sisi" + getSisi());
    }
}