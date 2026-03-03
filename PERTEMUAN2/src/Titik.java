// Nama File : Titik.java
// Deskripsi: berisi atribut dan method dalam class Titik
// Pembuat : Axel Anggian Hamonangan Purba
// Tanggal : 23 Februari 2026

public class Titik {
    private double absis;
    private double ordinat;
    static int counterTitik = 0;

    // Konstruktor
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    // Setter
    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // Geser titik
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Print
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // Counter
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Kuadran
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0;
    }

    // Jarak ke pusat
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Jarak antar titik
    public double getJarak(Titik T) {
        return Math.sqrt(
            Math.pow(this.absis - T.getAbsis(), 2) +
            Math.pow(this.ordinat - T.getOrdinat(), 2)
        );
    }

    // Refleksi
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }
}