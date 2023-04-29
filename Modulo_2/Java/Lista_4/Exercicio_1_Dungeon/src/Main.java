public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();

        Heroi desirArman = new Heroi();
        mapa.herois.add(desirArman);

        Inimigo mascaraDeCorvo = new Inimigo(50, 5, 100);
        mapa.inimigos.add(mascaraDeCorvo);

        Inimigo rafaelo = new Inimigo(200, 500, 10000);
        mapa.inimigos.add(rafaelo);

        System.out.println("O maior ataque entre os inimigos é: " + mapa.verificarMaiorAtaque());
    }
}