public class Masmorra {
    private String nome;
    private Ranks rank;
    Heroi heroi;

    public Masmorra() {
    }

    public Masmorra(String nome, Ranks rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public Heroi getHeroi() {
        return heroi;
    }

    public void setHeroi(Heroi heroi) {
        this.heroi = heroi;
    }
}

enum Ranks {
    C, B, A, S
}