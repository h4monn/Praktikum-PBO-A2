import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    //Kamus
    private int nbelm;
    private Queue<Anabul> Lanabul;
    //metode
    Piaraan(){
        nbelm = 0;
        Lanabul = new LinkedList<Anabul>();
    }
    public int getNbelm(){
        return nbelm;
    }
    public void enqueueAnabul(Anabul masuk){
        Lanabul.add(masuk);
        nbelm++;
    }
    public boolean isMember(Anabul cek){
        return Lanabul.contains(cek);
    }
    public Anabul getAnabul(){
        return Lanabul.peek();
    }
    public Anabul dequeueAnabul(){
        Anabul temp = Lanabul.poll();
        return temp;
    }
    public void showAnabul(){
        System.out.println("Daftar Anabul:");
        for(Anabul a:Lanabul){
            System.out.println(a.getNama());
        }
    }
    public int countKucing(){
        int count = 0;
        for(Anabul a:Lanabul){
            if (a instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    public double bobotKucing(){
        int bobot = 0;
        for(Anabul a:Lanabul){
            if(a instanceof Kucing){
                bobot += ((Kucing) a).getBerat();
            }
        }
        return bobot;
    }

    public void showJenisAnabul(){
        System.out.println("Daftar Anabul:");
        for(Anabul a:Lanabul){
            System.out.println(a.getNama() + " " + a.getClass());
        }
    }


}