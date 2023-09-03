public class Inimigo {
    public int ataque;
    public int defesa;
    public int vida;
    public int pontos;

    public Inimigo() {
        this.ataque = 20;
        this.defesa = 10;
        this.vida = 100;
        this.pontos = 50;
    }

    public Inimigo(int ataque, int defesa, int vida, int pontos) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
        this.pontos = pontos;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}