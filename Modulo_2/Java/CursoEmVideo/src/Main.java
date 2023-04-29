public class Main {
    public static void main(String[] args) {
        Lampada sala = new Lampada();
        sala.estado = false;
        sala.material = "plastico";
        sala.tipoDeLuz = "branca";
        sala.formato = "redonda";
        sala.desligar();

        System.out.print("A lampada da sala é feita de " + sala.material + ", " + sala.formato + " tem luz " + sala.tipoDeLuz + " e está ");
        sala.conferencia();
    }
}