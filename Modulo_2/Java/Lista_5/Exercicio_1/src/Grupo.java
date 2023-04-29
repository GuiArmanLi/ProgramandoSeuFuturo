import java.util.ArrayList;
public class Grupo {
    private int totalDeMoedas;
    private ArrayList<Heroi> herois;
    public Grupo(){
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi){
        int contador = 0;
        while (contador < herois.size()) {
            contador++;
            if (heroi.getId() == contador){
                System.out.println("O herói ja foi adicionado anteriormente ao grupo!");
                return;
            }
        }

        this.herois.add(heroi);

        this.totalDeMoedas = this.totalDeMoedas + heroi.getQuantidadeMoedasDeOuro();

        System.out.println("O herói " + heroi.getNome() + " foi adicionado no grupo!" );
    }
    public void removerHeroi(int idHeroi){
        for (int i = 0; i < herois.size(); i++) {
            if (herois.get(i).getId() == idHeroi){
                this.totalDeMoedas = totalDeMoedas - herois.get(i).getQuantidadeMoedasDeOuro();

                System.out.println("O herói " + herois.get(i).getNome() + " foi removido!");
                herois.remove(i);
                return;
            }
        }
        System.out.println("O Herói não foi encontrado! Verifique se digitou corretamento.");
    }

    public int getTotalDeMoedas() {
        return totalDeMoedas;
    }

    public void setTotalDeMoedas(int totalDeMoedas) {
        this.totalDeMoedas = totalDeMoedas;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }
}
