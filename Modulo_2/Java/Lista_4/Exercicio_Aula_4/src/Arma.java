public class Arma {
    String nome;
    int dano;
    int durabilidade;

    public Arma() {
    }

    public Arma(String nome, int dano, int durabilidade){
        this.nome = nome;
        this.dano = dano;
        this. durabilidade = durabilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}
