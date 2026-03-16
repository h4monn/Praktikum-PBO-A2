// Nama : Axel Anggian Hamonangan Purba
// NIM : 24060124140127
// Deskripsi : Program untuk menampilkan informasi tentang pegawai
// Tanggal : 9 Maret 2026

import java.time.*;

public class Main {
    public static void main(String[] args) {

        DosenTetap d1 = new DosenTetap(
                "1152006002",
                "78647324",
                "Lamhot Simanjuntak",
                LocalDate.of(1945,5,11),
                LocalDate.of(2015,1,1),
                500000,
                "Fakultas Sains dan Matematika"
        );

        d1.printInfo();
    }
}