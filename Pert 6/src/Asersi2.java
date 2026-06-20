class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) throws Exception {
        double jarijari = 0;
        assert(jarijari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}