import java.util.ArrayList;

public class Mapa {
    String nome;
    int rank; // De 1 - 8
    boolean tipo; // True = Portal Azul / False = Portal Vermelho

    public Mapa (){}
    public Mapa(String nome, int rank, boolean tipo){
        this.nome = nome;
        this.rank = rank;
        this.tipo = tipo;
    }
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
}
