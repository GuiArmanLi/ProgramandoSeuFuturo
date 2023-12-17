public class Main {
    public static void main(String[] args) {
        Masmorra masmorra = new Masmorra("Ilha de jeju", Ranks.S);
        masmorra.heroi = new Heroi("Guilherme", 100, 80, Classes.MAGO);

        System.out.println("O heroi " + masmorra.heroi.getNome() + " entrou na masmorra " + masmorra.getNome());

        System.out.println("O rank da masmorra é " + masmorra.getRank());

        System.out.println("O heroi é da classe " + masmorra.heroi.getClasse());
        System.out.println("O heroi carrega uma " + masmorra.heroi.getClasse().getArma());
        System.out.println("Sua arma causa " + masmorra.heroi.getClasse().getArma().getDano() + " de dano");
    }
}