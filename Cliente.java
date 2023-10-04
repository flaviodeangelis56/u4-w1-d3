public class Cliente {
    public String codice;
    public String nomeCognome;
    public String email;
    public String dataIscrizione;

public Cliente (String codice,String nomeCognome,String email,String dataIscrizione){
    this.codice=codice;
    this.nomeCognome=nomeCognome;
    this.email=email;
    this.dataIscrizione=dataIscrizione;
}

public void stampaCliente (){
    System.out.println("Cliente");
    System.out.println("codice : " + this.codice);
    System.out.println("descrizione : " + this.nomeCognome);
    System.out.println("prezzo : " + this.email);
    System.out.println("pezzi disponibili : " + this.dataIscrizione);
}
}
