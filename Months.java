public enum Months {
    JANEIRO(8305f),
    FEVEREIRO(5345f),
    MARCO(5234f),
    ABRIL(6452f),
    MAIO(5111f),
    JUNHO(89231f),
    JULHO(4298f),
    AGOSTO(7908f),
    SETEMBRO(4368f),
    OUTUBRO(3928f),
    NOVEMBRO(8431f),
    DEZEMBRO(9435f);

    private final float valor;

    Months(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
}

