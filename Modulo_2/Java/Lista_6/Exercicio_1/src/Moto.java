public class Moto extends Veiculo{

    @Override
    void habilidadeEspecial() {
        System.out.println("Grau!!!");
    }

    public Moto() {}

    public Moto(int id, int velocidadeMaxima, int precisaoEmCurvas) {
        super(id, velocidadeMaxima, precisaoEmCurvas);
    }
}
