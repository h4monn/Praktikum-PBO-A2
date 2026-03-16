// Nama : Axel Anggian Hamonangan Purba
// NIM : 24060124140127
// Deskripsi : Program untuk menampilkan informasi tentang pegawai tendik
// Tanggal : 9 Maret 2026

import java.time.LocalDate;

class Tendik extends Pegawai {
    String bidang;
    // Konstruktor untuk kelas Tendik
    Tendik(String nip, String nama, LocalDate tanggalLahir,
           LocalDate tmt, double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    // Method tendik
    void printInfo(){
        super.printInfo();

        int masaKerja = hitungMasaKerja();
        double tunjangan = 0.01 * masaKerja * gajiPokok;

        LocalDate pensiun = tanggalLahir.plusYears(55).withDayOfMonth(1).plusMonths(1);

        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        System.out.println("Tanggal Pensiun : " + pensiun);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + tunjangan);
    }
}