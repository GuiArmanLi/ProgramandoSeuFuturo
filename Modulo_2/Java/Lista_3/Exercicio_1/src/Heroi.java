public class Heroi {
    public static int ataque;
    public int defesa;
    public int vida;
    public int pontos;

    public Heroi(){
        this.ataque = 10;
        this.defesa = 10;
        this.vida = 100;
        this.pontos = 1000;
    }

    public static int golpear(){
        return (ataque/2);
    }
}
