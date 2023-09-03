import java.util.ArrayList;

public class Mapa {
    private String nome;
    private int rank; // De 1 - 8
    private boolean tipo; // True = Portal Azul / False = Portal Vermelho

    ArrayList<Heroi> herois = new ArrayList<Heroi>();
    ArrayList<Inimigo> inimigos = new ArrayList<>();
    public int verificarMaiorAtaque() {
        int maiorAtaque = 0;
        for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).getAtaque() > maiorAtaque) {
                maiorAtaque = inimigos.get(i).getAtaque();
            }
        }
        return maiorAtaque;
    }
    public Mapa (){}
    public Mapa(String nome, int rank, boolean tipo){
        this.nome = nome;
        this.rank = rank;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public ArrayList<Inimigo> getInimigos() {
        return inimigos;
    }

    public void setInimigos(ArrayList<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }
}
