public class Rettangolo {
    public int base;
    public int altezza;

    public Rettangolo(int b, int h){
        this.base = b;
        this.altezza = h;
    }

    public int perimetroRettangolo() {
        return (this.base*2) + (this.altezza*2);
    }

    public int areaRettangolo() {
        return this.base*this.altezza;
    }

}
