abstract class Anabul {
    //kamus
    private String Nama;
    //algoritma
    public Anabul(){
        Nama = "manusia";
    }
    public Anabul(String nama){
        this.Nama = nama;
    }
    public String getNama(){
        return Nama;
    }
    public void setNama(String nama){
        this.Nama = nama;
    }
    public abstract String Gerak();
    public abstract String Bersuara();
}