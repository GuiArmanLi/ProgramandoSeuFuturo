public class Heroi {
    private String nome;
    private String classe;
    private int vida;
    private int mana;
    private int nivel;
    private String arma;
    private Arma armaBasica = new Arma("Faquinha", 1, 100);

    public Heroi() {
    }

    public Heroi (String nome, String classe, int vida, int mana, int nivel){
        this.classe = classe;
        this.vida = vida;
        this.mana = mana;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public Arma getArmaBasica() {
        return armaBasica;
    }

    public void setArmaBasica(Arma armaBasica) {
        this.armaBasica = armaBasica;
    }
}
