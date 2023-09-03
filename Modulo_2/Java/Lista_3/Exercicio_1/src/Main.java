public class Main {
    public static void main(String[] args) {
        Mapa primeiroMapa = new Mapa("Calabouço da Serpente de Ferro", 1, true);
        Heroi heroi = new Heroi();
        primeiroMapa.herois.add(heroi);
        Inimigo mob1 = new Inimigo(100, 50, 50, 100);
        primeiroMapa.inimigos.add(mob1);
        Inimigo mob2 = new Inimigo(50, 100, 100, 50);
        primeiroMapa.inimigos.add(mob2);
        Inimigo mob3 = new Inimigo(150, 25, 25, 200);
        primeiroMapa.inimigos.add(mob3);

        System.out.println("Dentre os inimigos gerados, o maior ataque foi " + primeiroMapa.verificarMaiorAtaque());
    }
}