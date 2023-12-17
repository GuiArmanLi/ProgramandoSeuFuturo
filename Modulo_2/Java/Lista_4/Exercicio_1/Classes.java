public enum Classes {
    ESPADACHIM(Armas.ESPADA), TANQUE(Armas.ESCUDO), ARQUEIRO(Armas.ARCO), MAGO(Armas.CAJADO), ASSASSINO(Armas.ADAGA),
    BARBARO(Armas.MACHADO);

    private Armas arma;

    Classes(Armas arma) {
        this.arma = arma;
    }

    public Armas getArma() {
        return arma;
    }
}
