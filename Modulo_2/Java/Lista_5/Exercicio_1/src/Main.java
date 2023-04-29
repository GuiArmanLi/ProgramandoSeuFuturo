public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi(1, "Kauan", 34));
        grupo.adicionarHeroi(new Heroi(2, "Lucas", 89));
        grupo.adicionarHeroi(new Heroi(3, "Paulo", 12));
        grupo.adicionarHeroi(new Heroi(3, "Joao", 30));

        grupo.removerHeroi(1);

        System.out.println("O total de ouro do é: " + grupo.getTotalDeMoedas());
    }
}