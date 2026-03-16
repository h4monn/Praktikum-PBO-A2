// Nama : Axel Anggian Hamonangan Purba
// NIM : 24060124140127
// Deskripsi : Program untuk menampilkan informasi tentang pegawai
// Tanggal : 9 Maret 2026


import java.time.*;
import java.time.format.DateTimeFormatter;

class Pegawai {
    String nip;
    String nama;
    LocalDate tanggalLahir;
    LocalDate tmt;
    double gajiPokok;
    // Konstruktor untuk kelas Pegawai
    Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    // Method untuk menghitung masa kerja
    int hitungMasaKerja(){
        return Period.between(tmt, LocalDate.now()).getYears();
    }
    // Method untuk menampilkan informasi pegawai
    void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy");

        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(format));
        System.out.println("TMT : " + tmt.format(format));
    }
}