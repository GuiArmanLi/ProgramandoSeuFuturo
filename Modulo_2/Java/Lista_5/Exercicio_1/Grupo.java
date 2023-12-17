import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private List<Heroi> herois;
    private int totalDeMoedas;

    public Grupo() {
        this.herois = new ArrayList<>();
    }

    public int getTotalDeMoedas() {
        return totalDeMoedas;
    }

    public void setTotalDeMoedas(int totalDeMoedas) {
        this.totalDeMoedas = totalDeMoedas;
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(List<Heroi> herois) {
        this.herois = herois;
    }

    public String adicionarHeroi(Heroi heroi) {
        for (Heroi i : herois) {
            if (heroi.getId().equals(i.getId())) {
                return "Erro!";
            }
        }

        this.herois.add(heroi);
        this.totalDeMoedas += heroi.getQuantidadeMoedasDeOuro();
        return "Sucesso!";
    }

    public String removerHeroi(Heroi heroi) {
        for (Heroi h : herois) {
            if (h.getId().equals(heroi.getId())) {
                this.totalDeMoedas -= heroi.getQuantidadeMoedasDeOuro();

                herois.remove(heroi);
                return "Sucesso!";
            }
        }
        return "Erro!";
    }
}
