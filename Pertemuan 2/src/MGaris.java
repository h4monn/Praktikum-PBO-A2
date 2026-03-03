// Nama : Axel Anggian Hamonangan Purba
// NIM : 24060124140127
// Nama File : MGaris.java
// Deskripsi : berisi class MGaris untuk mengetes class Garis
// Tanggal : 23 Februari 2026
public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(1, 1);
        Titik T2 = new Titik(4, 5);
        Garis G1 = new Garis(T1, T2);
        G1.printGaris();
        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        System.out.println("Titik Tengah Garis: ");
        G1.getTitikTengah().printTitik();
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());
        Garis G2 = new Garis(new Titik(2, 2), new Titik(5, 6));
        System.out.println("Sejajar dengan G2? " + G1.isSejajar(G2));
        System.out.println("Tegak lurus dengan G2? " + G1.isTegakLurus(G2));
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
    }
}
