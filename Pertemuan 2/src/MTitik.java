// Nama : Axel Anggian Hamonangan Purba
// NIM : 24060124140127
// Nama File : MTitik.java
// Deskripsi : berisi class MTitik untuk mengetes class Titik

public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();

        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();

        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,4);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());

        System.out.println("T1 terletak di kuadran " + T1.getKuadran());
        System.out.println("Jarak T1 dengan Pusat " + T1.getJarakPusat());
        System.out.println("Jarak T1 dengan T4 " + T1.getJarak(T4));

        T1.refleksiX();
        T1.printTitik();

        T4.refleksiY();
        T4.printTitik();
    }
}