public class Masmorra {
    private int categoria;
    private int tipo;

    Heroi gui = new Heroi("Guilherme","Mago",100,100,1);
    public Masmorra() {
    }

    public Masmorra(int categoria, int tipo){
        this.categoria = categoria;
        this.tipo = tipo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Heroi getGui() {
        return gui;
    }

    public void setGui(Heroi gui) {
        this.gui = gui;
    }
}
