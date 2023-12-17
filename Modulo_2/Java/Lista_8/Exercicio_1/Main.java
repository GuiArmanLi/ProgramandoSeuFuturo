public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();

        try {
            grupo.adicionarHeroi(new Heroi("Lyn", Arma.ESPADA));

            grupo.adicionarHeroi(new Heroi("Marcus", Arma.LANCA));

            grupo.adicionarHeroi(new Heroi("Dorcas", Arma.MACHADO));

            grupo.adicionarHeroi(new Heroi("Marcus", Arma.LANCA));
            System.out.println(grupo.getHerois());

        } catch (NomeRepetidoException error) {
            System.out.println(error.getMessage());
        }
    }
}