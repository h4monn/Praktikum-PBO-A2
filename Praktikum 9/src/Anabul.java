abstract class Anabul {
    //kamus
    private String panggilan;
    //algoritma
    public Anabul(){
        panggilan = "manusia";
    }
    public Anabul(String nama){
        this.panggilan = nama;
    }
    public String getNama(){
        return panggilan;
    }
    public void setNama(String nama){
        this.panggilan = nama;
    }
    public abstract String Gerak();
    public abstract String Bersuara();
}