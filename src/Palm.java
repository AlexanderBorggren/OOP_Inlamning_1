public class Palm extends Växter {
    // Polymorfism: Palm är en subklass av växter och overridar dess metoder.
    private VätskeTyp typ = VätskeTyp.KRAN_VATTEN; //Inkapsulering: privat variabel
    private double vätskeBehov = (getVäxtLängd() / 100) * 50; //Inkapsulering: privat variabel
    Palm(int växtLängd){
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
