public class Inimigo {
    public int ataque;
    public int defesa;
    public int vida;
    public int pontos;

    public Inimigo(){
        this.ataque = 10;
        this.defesa = 10;
        this.vida = 100;
        this.pontos = 50;
    }

    public int morder(){
        return (ataque/2);
    }
}
