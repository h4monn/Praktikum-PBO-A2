public class AplikasiAnabul {
    public static void main(String[] args) {
        Anabul[] hewan = {
            new Kucing("Mimi"),
            new Anjing("Rex"),
            new Burung("Tiwi")
        };

        for (Anabul a : hewan) {
            a.Bersuara();
            a.Gerak();
            System.out.println();
        }
    }
}