import java.util.ArrayList;
import java.util.List;
public class Grupo {
    private List<Heroi> herois;

    public Grupo(){
        this.herois = new ArrayList<>();
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    public void adicionarHeroi(Heroi novoHeroi) throws NomeRepetidoException {
        for (Heroi heroiPresenteNoGrupo: herois){
            String nomeNovoHeroi = novoHeroi.getNome();
            String nomeHeroiPresenteNoGrupo = heroiPresenteNoGrupo.getNome();

            if (nomeNovoHeroi.equals(nomeHeroiPresenteNoGrupo)){
                throw new NomeRepetidoException();
            }
        }

        this.herois.add(novoHeroi);
    }
}
