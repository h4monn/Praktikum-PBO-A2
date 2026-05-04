public class KonversiDanPolimorfisme {
    public static void main(String[] args) {

        int nilaiInt = 65;
        System.out.println("Sebagai integer: " + nilaiInt);
        System.out.println("Sebagai karakter: " + (char) nilaiInt);
        System.out.println("Sebagai real (double): " + (double) nilaiInt);

        int angkaInt = 100;
        double angkaDouble = (double) angkaInt;
        int kembaliKeInt = (int) angkaDouble;
        System.out.println("Kembali ke Int : " + kembaliKeInt);

        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Konkatenasi S: " + S);
        System.out.println("Penjumlahan Z: " + Z);

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi R: " + R);
        System.out.println("Penjumlahan D: " + D);

        Integer A = Integer.parseInt(S);
        System.out.println("Nilai A: " + A);

        String T = Integer.toString(A);
        System.out.println("Nilai T: " + T);
    }
}