/*
 * File     : MMahasiswa.java
 * Deskripsi : Program utama untuk menguji kelas Mahasiswa, Dosen, Kendaraan, dan Matakuliah
 * Pembuat  : Axel Purba - 24060124140127
 * Tanggal   : 2024-06-01
 */
public class MMahasiswa {
    public static void main(String[] args) {
        // Objek Dosen
        Dosen d1 = new Dosen("198765", "Budi", "Informatika");
        Dosen d2 = new Dosen("197889", "Nudi", "Informatika");

        // Objek Kendaraan
        Kendaraan k1 = new Kendaraan("BK 1234 AB", "Motor");
        Kendaraan k2 = new Kendaraan("BK 9876 CD", "Mobil");

        // Objek Matakuliah
        Matakuliah mk1 = new Matakuliah("IF101", "Pemrograman Berorientasi Objek", 3);
        Matakuliah mk2 = new Matakuliah("IF102", "Basis Data", 3);
        Matakuliah mk3 = new Matakuliah("IF103", "Struktur Data", 4);
        Matakuliah mk4 = new Matakuliah("IF104", "Jaringan Komputer", 3);

        // Objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa(
                "Axel Purba",
                "24060124140127",
                "Informatika",
                d1,
                k1
        );

        Mahasiswa m2 = new Mahasiswa(
                "Rudi Octamar",
                "24060124140128",
                "Informatika",
                d2,
                k2
        );

        //Relasi Mahasiswa dengan Matakuliah
        m1.addMatkul(mk1);
        m1.addMatkul(mk2);
        m1.addMatkul(mk3);

        m2.addMatkul(mk1);
        m2.addMatkul(mk4);

        // Output 1
        System.out.println("Data Mhs 1");
        m1.printDetailMhs();
        System.out.println("Jumlah Matkul : " + m1.getJumlahMatkul());
        System.out.println("Total SKS     : " + m1.getJumlahSKS());

        System.out.println();

        //Output 2
        System.out.println("Data Mhs 2");
        m2.printDetailMhs();
        System.out.println("Jumlah Matkul : " + m2.getJumlahMatkul());
        System.out.println("Total SKS     : " + m2.getJumlahSKS());
    }
}

