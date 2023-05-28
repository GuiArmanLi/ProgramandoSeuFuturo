public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        Prensador prensador = new Prensador();
        Dobrador dobrador = new Dobrador();
        Cortador cortador = new Cortador();
        prensador.produzir();
        dobrador.produzir();
        cortador.produzir();
    }
}