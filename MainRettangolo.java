public class MainRettangolo {
    public static void main(String[] args) {
        Rettangolo test1 = new Rettangolo(20, 10);
        Rettangolo test2 = new Rettangolo(10, 5);
        stampaRettangolo(test1.areaRettangolo(), test1.perimetroRettangolo());
stampaDueRettangoli(test1.areaRettangolo(), test1.perimetroRettangolo(), test2.areaRettangolo(), test2.perimetroRettangolo());
    }


    public static void stampaRettangolo(int area,int perimetro) {
        System.out.println("area rettangolo: " + area);
        System.out.println("perimetro rettangolo: " + perimetro);
    }

    public static void stampaDueRettangoli(int area1,int perimetro1,int area2,int perimetro2) {
        System.out.println("area primo rettangolo: " + area1);
        System.out.println("perimetro primo rettangolo: " + perimetro1);
        System.out.println("area secondo rettangolo: " + area2);
        System.out.println("perimetro secondo rettangolo: " + perimetro2);
        System.out.println("somma aree rettangoli: " + (area2 + area1));
        System.out.println("somma perimetri rettangoli: " + (perimetro2 + perimetro1));
        System.out.println("somma aree perimetri rettangoli: " + (perimetro2 + perimetro1 + area1 + area2));
    }
}
