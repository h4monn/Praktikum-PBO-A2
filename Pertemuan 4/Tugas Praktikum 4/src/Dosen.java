// Nama : Axel Anggian Hamonangan Purba
// NIM : 24060124140127
// Deskripsi : Program untuk menampilkan informasi tentang pegawai dosen
// Tanggal : 9 Maret 2026


import java.time.LocalDate;

class Dosen extends Pegawai {
    String fakultas;
    // Konstruktor untuk kelas Dosen
    Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}