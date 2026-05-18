class Data<G>{
    //kamus
    G[] ruang;
    int banyak;
    //algoritma
    @SuppressWarnings("unchecked")
    Data(){
        ruang = (G[]) new Object[100];
        banyak = 0;
    }
    public G getIsi(int idx){
        return ruang[idx - 1];
    }

    public void setIsi(int idx, G objek){
        if(ruang[idx - 1] == null){
            ruang[idx - 1] = objek;
            banyak++;
        }
        else{
            ruang[idx - 1] = objek;
        }
    }
    public int getSize(){
        return banyak;
    }
}