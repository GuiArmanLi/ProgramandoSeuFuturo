public class Main {
    public static void main(String[] args) {
        Masmorra arquiteto = new Masmorra(5, 1);

        System.out.println("O herói " + arquiteto.gui.getClasse() + " entrou na masmorra com categoria " + arquiteto.getCategoria() + ".");
    }
}