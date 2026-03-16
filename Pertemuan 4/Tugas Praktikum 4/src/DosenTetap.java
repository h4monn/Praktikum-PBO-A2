// Nama : Axel Anggian Hamonangan Purba
// NIM : 24060124140127
// Deskripsi : Program untuk menampilkan informasi tentang pegawai dosen tetap
// Tanggal : 9 Maret 2026


import java.time.LocalDate;

class DosenTetap extends Dosen {
    String nidn;
    // Konstruktor untuk kelas DosenTetap
    DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir,
               LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }
    // Method dosen tetap
    void printInfo(){
        super.printInfo();

        int masaKerja = hitungMasaKerja();
        double tunjangan = 0.02 * masaKerja * gajiPokok;

        LocalDate pensiun = tanggalLahir.plusYears(65).withDayOfMonth(1).plusMonths(1);

        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        System.out.println("Tanggal Pensiun : " + pensiun);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + tunjangan);
    }
}