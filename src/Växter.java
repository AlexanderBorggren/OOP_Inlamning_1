public abstract class Växter implements Vätska {
    private double växtLängd; //Inkapsulering: växtlängd är privat
    Växter(double växtLängd) {
        this.växtLängd = växtLängd;
    }

    public double getVäxtLängd() { //Inkapsulering: getter till den privata växtländ.
        return växtLängd;
    }

    public void setVäxtLängd(double växtLängd) { //Inkapsulering: setter till den privata växtländ. Ej använd men kan vara användbar i framtiden.
        this.växtLängd = växtLängd;
    }

}
