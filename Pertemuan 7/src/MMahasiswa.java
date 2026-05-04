public class MMahasiswa {
    public static void main(String[] args){
        Mahasiswa Asep = new Mahasiswa();
        Mahasiswa Budi = new Mahasiswa("240042","Budi","Hukum");
        Mahasiswa CopyBudi = new Mahasiswa(Budi);

        Asep.SetProgramStudi();
        System.out.println(Asep.getProgramStudi());

        Asep.SetProgramStudi("Informatika");
        System.out.println(Asep.getProgramStudi());

        Asep.SetProgramStudi(Budi);
        System.out.println(Asep.getProgramStudi());

        System.out.println(CopyBudi.getProgramStudi());
    }
}