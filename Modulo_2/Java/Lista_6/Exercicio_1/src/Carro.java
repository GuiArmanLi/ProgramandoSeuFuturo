public class Carro extends Veiculo{

    @Override
    void habilidadeEspecial() {
        System.out.println("Atirador sai da janela e começa a atirar nos inimigos!!!");
    }

    public Carro() {}

    public Carro(int id, int velocidadeMaxima, int precisaoEmCurvas) {
        super(id, velocidadeMaxima, precisaoEmCurvas);
    }
}
