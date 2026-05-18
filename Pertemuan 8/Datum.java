class Datum<G>{
    //kamus
    G value;
    //algoritma
    Datum(G value){
        this.value = value;
    }
    public G getIsi(){
        return value;
    }

    public void setIsi(G value){
        this.value = value;
    }
}