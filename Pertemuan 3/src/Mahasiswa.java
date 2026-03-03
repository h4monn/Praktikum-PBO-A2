/*
Nama File: Mahasiswa.java
Deskripsi: Berisi atribut dan method Mahasiswa
Pembuat: Axel Anggian Hamonangan Purba / 24060124140127
Tanggal: 2 Maret 2026
*/

public class Mahasiswa {
    //Atribut
    private String nama;
    private String nim; 
    private String prodi;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private Matakuliah[] listMatkul = new Matakuliah[50];
    private int jumlahMatkul = 0;

    //Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //Konstruktor dengan parameter
    public Mahasiswa(String nama, String nim, String prodi,
                     Dosen dosenWali, Kendaraan kendaraan) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    //Selektor dan Mutator
    //Selektor
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getProdi() { return prodi; }
    public Dosen getDosenWali() { return dosenWali; }
    public Kendaraan getKendaraan() { return kendaraan; }

    //Mutator
    public void setNama(String nama) { this.nama = nama; }
    public void setNim(String nim) { this.nim = nim; }
    public void setProdi(String prodi) { this.prodi = prodi; }
    public void setDosenWali(Dosen d) { this.dosenWali = d; }
    public void setKendaraan(Kendaraan k) { this.kendaraan = k; }

    // Method tambah matkul
    public void addMatkul(Matakuliah matkul) {
        if (jumlahMatkul < listMatkul.length) {
            listMatkul[jumlahMatkul] = matkul;
            jumlahMatkul++;
        } else {
            System.out.println("Kapasitas Matkul penuh");
        }
    }

    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            total += listMatkul[i].getSks();
        }
        return total;
    }

    public int getJumlahMatkul() {
        return jumlahMatkul;
    }

    // tampil data mahasiswa
    public void printMhs() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
    }

    // tampil detail mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("Kendaraan  : " + kendaraan.getJenis());
        System.out.println("No Plat    : " + kendaraan.getNoPlat());

        System.out.println("\nDaftar Matakuliah:");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("- " +
                listMatkul[i].getNamaMatkul() +
                " (" + listMatkul[i].getSks() + " SKS)");
        }

        System.out.println("Total SKS : " + getJumlahSKS());
    }
}