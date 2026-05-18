public class MTeman {
    public static void main(String[] args){
        Teman t = new Teman();
        t.addNama("Lamhot");
        t.addNama("Poltak");
        t.addNama("Sahat");
        t.addNama("Lamhot");
        
        System.out.println("Nama Teman:");
        t.showTeman();

        System.out.println("Jumlah Teman: " + t.getNbElm());
        System.out.println("Nama indeks 1: " + t.getNama(1));
        System.out.println("Apakah lamhot teman? " + t.isMember("Lamhot"));
        System.out.println("Jumlah nama Lamhot:" + t.countNama("Lamhot"));
        t.gantiNama("Sahat", "Nico");
        System.out.println("Nama Teman setelah ganti nama:");
        t.showTeman();
        
        t.delNama(0);
        System.out.println("setelah menghapus indeks 0:");
        t.showTeman();
    }
}
