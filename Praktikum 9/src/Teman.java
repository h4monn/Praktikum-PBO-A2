import java.util.*;

public class Teman {
    // Atribut
    private int nbElm;
    private List<String> Lnama;

    // Konstruktor
    public Teman() {
        nbElm = 0;
        Lnama = new ArrayList<String>();
    }
    //Method
    public int getNbElm() {
        return nbElm;
    }
    // Method untuk mendapatkan nama berdasarkan indeks
    public String getNama(int indeks) {
        if (indeks < 0 || indeks >= nbElm) {
            return null;
        }
        return Lnama.get(indeks);
    }
    // Method untuk mengubah nama berdasarkan indeks
    public void setNama(int indeks){
        if (indeks < 0 || indeks >= nbElm) {
            return;
        }
        Lnama.set(indeks, Lnama.get(indeks));
    }
    //Method utk nambah nama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbElm++;
    }
    //Method utk hapus nama
    public void delNama(int indeks) {
        if (indeks < 0 || indeks >= nbElm) {
            return;
        }
        Lnama.remove(indeks);
        nbElm--;
    }
    // Method memeriksa apakah nama tersebut ada di daftar
    public boolean isMember (String nama) {
        return Lnama.contains(nama);
    }
    // Method untuk mengganti nama
    public void gantiNama(String nama, String namaBaru) {
        int indeks = Lnama.indexOf(nama);
        if (indeks >= 0) {
            Lnama.set(indeks, namaBaru);
        }
    }
    //Method untuk hitung jumlah nama sama
    public int countNama(String nama){
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }
    // Menampilkan semua nama teman
    public void showTeman() {
        for (String nama : Lnama) {
            System.out.println(nama);
        }
    }
}