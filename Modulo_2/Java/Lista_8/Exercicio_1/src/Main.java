public class Main {
    public static void main(String[] args) throws NomeRepetidoException {
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi(1, "Lyn", Arma.ESPADA));
        grupo.adicionarHeroi(new Heroi(2, "Marcus", Arma.LANCA));
        grupo.adicionarHeroi(new Heroi(3, "Dorcas", Arma.MACHADO));

        try{
            grupo.adicionarHeroi(new Heroi(4, "Marcus", Arma.LANCA));
        }catch (NomeRepetidoException exception){
            System.out.println("Nome repetido! Favor, adicionar outro nome.");
        }
    }
}