public class Articolo {
    public String codice;
    public String descrizione;
    public double prezzo;
    public int pezziDisponibili;

    public Articolo(String codice,String descrizione,double prezzo,int pezziDisponibili) {
        this.codice=codice;
        this.descrizione = descrizione;
        this.prezzo  = prezzo;
        this.pezziDisponibili  = pezziDisponibili;
    }

    public void stampaArticolo () {
        System.out.println("Articolo");
        System.out.println("codice : " + this.codice);
        System.out.println("descrizione : " + this.descrizione);
        System.out.println("prezzo : " + this.prezzo);
        System.out.println("pezzi disponibili : " + this.pezziDisponibili);

    }
}
