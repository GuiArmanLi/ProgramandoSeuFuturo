public class Heroi {
    String nome;
    String classe;
    int vida;
    int mana;
    int nivel;
    String arma;
    Arma armaBasica = new Arma("Faquinha", 1, 100);

    public Heroi (String nome, String classe, int vida, int mana, int nivel){
        this.classe = classe;
        this.vida = vida;
        this.mana = mana;
        this.nivel = nivel;
    }
}
