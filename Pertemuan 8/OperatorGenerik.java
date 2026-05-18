public class OperatorGenerik{
    //kamus
    //algoritma
    public static <G> void Tukar(Datum<G> a,Datum<G> b){
        G temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static <G extends Kucing> double Bobot2(G a,G b){
        return a.getBerat() + b.getBerat();
    }

}