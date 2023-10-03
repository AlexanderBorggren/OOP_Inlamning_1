public class Kaktus extends Växter {
    // Polymorfism: Kaktus är en subklass av växter och overridar dess metoder.
    private VätskeTyp typ = VätskeTyp.MINERAL_VATTEN; //Inkapsulering: Privat variabel
    private double vätskeBehov = 2; //Inkapsulering: Privat variabel.
    Kaktus(int växtLängd){
        super(växtLängd);
    }
    @Override
    public String getVätskeTyp() { //Inkapsulering: Getter till privat variabel.
        return typ.getVätskeTypeEnum();
    }
    @Override
    public double getVätskeBehov() { //Inkapsulering: Getter till privat variabel.
        return vätskeBehov;
    }
}
