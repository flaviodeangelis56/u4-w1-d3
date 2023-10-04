public class SIM {
    public String numero;
    public int credito;

    public Chiamate[] ultimeChiamate;

public SIM(String numero,int credito,Chiamate[] ultimeChiamate) {
    this.numero = numero;
    this.credito  = 0;
    this.ultimeChiamate = ultimeChiamate;
}

public void stampaSIM (String numero,int credito,Chiamate[] ultimeChiamate) {
    System.out.println("numero di telefono : " + numero);
    System.out.println("credito : " + credito);
    System.out.println("ultime chiamate : " + ultimeChiamate.toString());
}
}
