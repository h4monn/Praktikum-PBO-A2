public class Main{
    public static void main(String[] args){
        Datum<Anabul> hewan = new Datum<>(new Kembangtelon("Lamhot",20));
        System.out.println(hewan.getIsi());
        hewan.setIsi(new Anggora("Joko",15));
        System.out.println(hewan.getIsi());
        Datum<Anabul> abdi = new Datum<>(new Kembangtelon("Lamhot",20));
        Datum<Anabul> anwar = new Datum<>(new Kembangtelon("Poltak",15));
        Datum<Integer> satu = new Datum<>(5);
        Datum<Integer> lima = new Datum<>(1);
        Datum<String> dua = new Datum<>("3");
        Datum<String> tiga = new Datum<>("2");
        OperatorGenerik.Tukar(abdi,anwar);
        OperatorGenerik.Tukar(satu,lima);
        OperatorGenerik.Tukar(dua,tiga);
        System.out.println("Anabul:" + abdi.getIsi() + anwar.getIsi());
        System.out.println("Integer:" + satu.getIsi() + lima.getIsi());
        System.out.println("String:" + dua.getIsi() + tiga.getIsi());
        Kucing Nina = new Kembangtelon("Nina",10);
        Kucing lady = new Anggora("Maynita",99);
        double Maynita = OperatorGenerik.Bobot2(Nina,lady);
        System.out.println(Maynita);
        Data<Anabul> data = new Data<>();
        data.setIsi(1,abdi.getIsi());
        data.setIsi(2, lady);
        data.setIsi(3, anwar.getIsi());
        for(int i = 0;i < data.getSize();i ++){
            Anabul temp = data.getIsi(i + 1);
            System.out.println("Isi posisi " + i +": " + temp.getNama());
        }
    }
}