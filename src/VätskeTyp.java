public enum VätskeTyp {
    KRAN_VATTEN("Kranvatten"),
    MINERAL_VATTEN("Mineralvatten"),
    PROTEIN_DRYCK("Proteindryck");

    private final String typ; //Inkapsulering: privat variabel

    VätskeTyp(String typ) {
        this.typ = typ;
    }

    public String getVätskeTypeEnum() { //Inkapsulering: Getter till privat variabel
        return this.typ;
    }
}

