public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        System.out.println();
        Anjing doggy = new Anjing("Doggy");
        Burung tweetie = new Burung("Tweetie");
        
        Kucing mpus = new Kucing("Mpus", 3.5);
        Anggora Snowy = new Anggora("Snowy", 4.2);
        Kembangtelon Belang = new Kembangtelon("Belang", 3.8);

        System.out.println("Objek berhasil dibuat.");
        System.out.println();

        System.out.println();
        klinik.enqueueAnabul(doggy);
        klinik.enqueueAnabul(mpus);
        klinik.enqueueAnabul(tweetie);
        klinik.enqueueAnabul(Snowy);
        klinik.enqueueAnabul(Belang);

        System.out.println("Total hewan di antrean saat ini: " + klinik.getNbelm() + " hewan.");
        System.out.println();

        System.out.println("Nama Panggilan Anabul di Antrean:");
        klinik.showAnabul();
        System.out.println();

        System.out.println("Nama dan jenis Anabul di Antrean:");
        klinik.showJenisAnabul();
        System.out.println();

        System.out.println("Perhitungan khusus untuk keluarga kucing:");
        System.out.println("Banyaknya keluarga kucing di antrean: " + klinik.countKucing()); 
        
        System.out.println("Total bobot seluruh keluarga kucing: " + klinik.bobotKucing() + " kg");
        System.out.println();

        System.out.println("Cek Anabul tertentu di antrean:");
        Anabul depan = klinik.getAnabul();
        System.out.println("Hewan paling depan: " + depan.getNama());
        System.out.println("Cara bergerak: " + depan.Gerak());
        System.out.println("Suaranya: " + depan.Bersuara());
        System.out.println();

        System.out.println("Uji Polimorfisme:");
        Anabul keluar1 = klinik.dequeueAnabul();
        System.out.println("Selesai dirawat: " + keluar1.getNama() + " (" + keluar1.getClass().getSimpleName() + ")");
        
        Anabul keluar2 = klinik.dequeueAnabul();
        System.out.println("Selesai dirawat: " + keluar2.getNama() + " (" + keluar2.getClass().getSimpleName() + ")");
        System.out.println();

        System.out.println("Sisa Anabul di antrean setelah beberapa keluar:");
        System.out.println("Total hewan tersisa: " + klinik.getNbelm());
        klinik.showAnabul();
    }
}