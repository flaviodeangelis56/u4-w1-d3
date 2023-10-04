public class MainECommerce {
    public static void main(String[] args) {
Articolo articolo1 = new Articolo("DR4HD65","web camera full hd 1080p", 34.45 , 4);
Cliente cliente1 = new Cliente("HCJ89JS","Flavio De Angelis","deangelisflavio@gmail.com","4/10/2023");
Carrello carrello = new Carrello("HCJ89Js");

articolo1.stampaArticolo();
cliente1.stampaCliente();
carrello.stampaCarrello();
    }

}
