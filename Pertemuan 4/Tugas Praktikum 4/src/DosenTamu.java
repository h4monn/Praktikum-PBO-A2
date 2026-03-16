// Nama : Axel Anggian Hamonangan Purba
// NIM : 24060124140127
// Deskripsi : Program untuk menampilkan informasi tentang pegawai dosen tamu
// Tanggal : 9 Maret 2026


import java.time.LocalDate;

class DosenTamu extends Dosen {
    String nidk;
    int masaKontrak;
    // Konstruktor untuk kelas DosenTamu
    DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir,
              LocalDate tmt, double gajiPokok, String fakultas, int masaKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.masaKontrak = masaKontrak;
    }
    // Method dosen tamu
    void printInfo(){
        super.printInfo();

        double tunjangan = 0.025 * gajiPokok;

        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + tunjangan);
    }
}