/*
 * File     : Kendaraan.java
 * Deskripsi : Kelas Kendaraan untuk menyimpan informasi tentang kendaraan mahasiswa
 * Pembuat  : Axel Purba - 24060124140127
 * Tanggal   : 2024-06-01
 */

public class Kendaraan {
    //Atribut
    private String NoPlat, Jenis;

    //Method
    //Konstruktor tanapa parameter
    public Kendaraan(){
        this.NoPlat = "";
        this.Jenis = "";
    }

    //Konstruktor dengan parameter
    public Kendaraan(String NoPlat, String Jenis){
        this.NoPlat = NoPlat;
        this.Jenis = Jenis;
    }

    //Selektor dan Mutator
    //Selektor
    public String getNoPlat(){
        return this.NoPlat;
    }

    public String getJenis(){
        return this.Jenis;
    }

    //Mutator
    public void setNoPlat(String NoPlat){
        this.NoPlat = NoPlat;
    }

    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
}
