public class Inimigo {
    private int ataque;
    private int defesa;
    private int pontos;

    public Inimigo(){}
    public Inimigo (int ataque, int defesa, int pontos){
        this.ataque =  ataque;
        this.defesa = defesa;
        this.pontos = pontos;
    }
    public int getAtaque(){
        return this.ataque;
    }
    public int setAtaque(int ataque){
        return this.ataque = ataque;
    }
    public int getDefesa(){
        return this.defesa;
    }
    public int setDefesa(int defesa){
        return this.defesa = defesa;
    }
    public int getPontos(){
        return this.pontos;
    }
    public int setPontos(int pontos){
        return this.pontos = pontos;
    }
}