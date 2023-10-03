public class Köttätande extends Växter {
    // Polymorfism: Köttätande är en subklass av växter och overridar dess metoder.
    private VätskeTyp typ = VätskeTyp.PROTEIN_DRYCK; //Inkapsulering: Privat variabel
    private double vätskeBehov = 10 + ((getVäxtLängd() * 20)/100); //Inkapsulering: Privat variabel.
    Köttätande(double växtLängd){
        super(växtLängd);
    }

    @Override
    public String getVätskeTyp() { //Inkapsulering: getter till privat variabel.
        return typ.getVätskeTypeEnum();
    }

    @Override
    public double getVätskeBehov() { //Inkapsulering: getter till privat variabel.
        return vätskeBehov;
    }
}
