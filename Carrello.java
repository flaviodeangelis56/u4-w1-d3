public class Carrello {
    public String cliente;

    public Articolo[] articoli  = new Articolo[5];

    public double totale;

    public Carrello(String cliente){
        this.cliente=cliente;
        this.totale=0;

    }
 public void stampaCarrello(){
        System.out.println("Carrello");
     System.out.println("codice cliente : " + this.cliente);
     if (this.articoli == null){
         System.out.println("non ci sono articoli");
     }else{
     System.out.println("lista articoli : " + this.articoli);}
     System.out.println("totale prezzo : " + this.totale);
 }

}
