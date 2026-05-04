class Civitasakademika {
    String Nama;

    Civitasakademika(String nama) {
        Nama = nama;
    }

    String getNomor() {
        return "N/A";
    }
}

class Dosen extends Civitasakademika {
    String NIP;

    Dosen(String nama, String nip) {
        super(nama);
        NIP = nip;
    }

    @Override
    String getNomor() {
        return NIP;
    }
}

class MahasiswaSeminar extends Civitasakademika {
    String NIM;
    Dosen Dosenwali;

    MahasiswaSeminar(String nama, String nim) {
        super(nama);
        NIM = nim;
        Dosenwali = null;
    }

    @Override
    String getNomor() {
        return NIM;
    }

    void setWali(Dosen d) {
        Dosenwali = d;
    }

    void tampilDataMahasiswa() {
        String wali = (Dosenwali != null) ? Dosenwali.Nama : "Belum ada";
        System.out.println("NIM: " + NIM + " | Nama: " + Nama + " | Dosen Wali: " + wali);
    }
}

class Seminar {
    Civitasakademika[] pesertas = new Civitasakademika[100];  
    int banyakpeserta;

    Seminar() {
        banyakpeserta = 0; 
    }

    int countPeserta() {
        return banyakpeserta;
    }

    void registrasi(Civitasakademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
        } else {
            System.out.println("Kapasitas seminar penuh!");
        }
    }

    void tampilPeserta() {
        System.out.println("=== Daftar Peserta Seminar ===");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println("Nomor: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].Nama);
        }
    }

    int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) count++;
        }
        return count;
    }
}

public class AplikasiSeminar {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Arsi", "NIP001");
        Dosen d2 = new Dosen("Infor", "NIP002");

        MahasiswaSeminar m1 = new MahasiswaSeminar("Lamhot", "NIM001");
        MahasiswaSeminar m2 = new MahasiswaSeminar("Poltak", "NIM002");
        MahasiswaSeminar m3 = new MahasiswaSeminar("Burhan", "NIM003");
        MahasiswaSeminar m4 = new MahasiswaSeminar("Yuzhong", "NIM004");
        MahasiswaSeminar m5 = new MahasiswaSeminar("LapuLapu", "NIM005");

        Seminar seminar = new Seminar();

        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        System.out.println("Jumlah peserta: " + seminar.countPeserta());

        seminar.tampilPeserta();

        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);

        System.out.println("Data Mahasiswa");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}