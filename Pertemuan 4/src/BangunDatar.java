/*
 * File     : BangunDatar.java
 * Deskripsi : Kelas BangunDatar untuk menyimpan informasi tentang bangun datar
 * Pembuat  : Axel Purba - 24060124140127
 * Tanggal   : 9 Maret 2026
 */

public class BangunDatar {
    private int JmlSisi;    
    private String Warna;
    private String Border;

    public BangunDatar(int JmlSisi, String Warna, String Border) {
        this.JmlSisi = JmlSisi;
        this.Warna = Warna;
        this.Border = Border;
    }
    
    public int getJmlSisi() {
        return JmlSisi;
    }

    public void setJmlSisi(int JmlSisi) {
        this.JmlSisi = JmlSisi;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getBorder() {
        return Border;
    }

    public void setBorder(String Border) {
        this.Border = Border;
    }

    public void printInfo() {
        System.out.println("Jumlah Sisi: " + JmlSisi);
        System.out.println("Warna: " + Warna);
        System.out.println("Border: " + Border);
    }
}
