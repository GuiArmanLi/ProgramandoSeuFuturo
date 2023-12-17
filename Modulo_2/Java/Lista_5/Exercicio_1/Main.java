import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi("Kauan", random.nextInt(0, 100)));
        grupo.adicionarHeroi(new Heroi("Lucas", random.nextInt(0, 100)));
        grupo.adicionarHeroi(new Heroi("Paulo", random.nextInt(0, 100)));
        grupo.adicionarHeroi(new Heroi("Joao", random.nextInt(0, 100)));

        grupo.removerHeroi(grupo.getHerois().get(2));

        for (Heroi heroi : grupo.getHerois()) {
            System.out.println(heroi);
        }

        System.out.println("O total de ouro do é: " + grupo.getTotalDeMoedas());
    }
}