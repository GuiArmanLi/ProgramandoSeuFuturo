public class Main {
    public static void main(String[] args) {
        Mapa antKing = new Mapa("Ant King", Ranks.S, false);

        antKing.getHerois().add(new Heroi());
        antKing.getInimigos().add(new Inimigo(100, 50, 50, 100));
        antKing.getInimigos().add(new Inimigo(50, 100, 100, 50));
        antKing.getInimigos().add(new Inimigo(150, 25, 25, 200));

        System.out.println("Maior ataque inimigo: " + antKing.verificaMaiorAtaqueInimigo());
    }
}