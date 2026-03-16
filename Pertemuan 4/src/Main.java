public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5, "Merah", "Solid");
        Lingkaran lingkaran = new Lingkaran(7, "Biru", "Dashed");

        System.out.println("Persegi:");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());

        System.out.println("\nLingkaran:");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
    }
}
