public class SIM {
    public String numero;
    public int credito;

    public Chiamate[] ultimeChiamate;

public SIM(String numero) {
    this.numero = numero;
    this.credito  = 0;
    this.ultimeChiamate = ultimeChiamate;
}

public void stampaSIM () {
    System.out.println("numero di telefono : " + this.numero);
    System.out.println("credito : " + this.credito);
    if (this.ultimeChiamate == null){
        System.out.println("ultime chiamate : non ci sono chiamate");
    }else {
    System.out.println("ultime chiamate : " + this.ultimeChiamate.toString());}
}
}
