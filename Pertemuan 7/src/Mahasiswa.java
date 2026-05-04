public class Mahasiswa {
        //kamus
        public String NIM;
        public String Nama;
        public String Programstudi; 
        //algoritma
        public Mahasiswa(){
            NIM = "-999";
            Nama = "n/a";
            Programstudi = "n/a";
        }
        public Mahasiswa(String NIM,String Nama,String Programstudi){
            this.NIM = NIM;
            this.Nama = Nama;
            this.Programstudi = Programstudi;
        }
        public Mahasiswa(Mahasiswa maha){
            this.NIM = maha.getNIM();
            this.Nama = maha.getNama();
            this.Programstudi = maha.getProgramStudi();
        }
        public String getProgramStudi(){
            return Programstudi;
        }
        public String getNIM(){
            return NIM;
        }
        public String getNama(){
            return Nama;
        }
        public void SetProgramStudi(){
            Programstudi = "Kosong";
        }
        public void SetProgramStudi(String Programstudi){
            this.Programstudi = Programstudi;
        }
        public void SetProgramStudi(Mahasiswa maha){
            this.Programstudi = maha.getProgramStudi();
        }
        //A

    
}