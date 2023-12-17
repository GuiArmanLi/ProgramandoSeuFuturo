import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private List<Heroi> herois;

    public Grupo() {
        this.herois = new ArrayList<>();
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    public void adicionarHeroi(Heroi novoHeroi) throws NomeRepetidoException {
        for (Heroi heroi : this.getHerois()) {
            System.out.println(heroi);

            if (heroi.getNome().equalsIgnoreCase(novoHeroi.getNome())) {
                this.getHerois().add(novoHeroi);
                throw new NomeRepetidoException();
            }
        }
    }
}
