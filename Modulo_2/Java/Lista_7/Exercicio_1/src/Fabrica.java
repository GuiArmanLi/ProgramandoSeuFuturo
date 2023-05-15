import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private int id;
    private ArrayList<Prensador> prensador = new ArrayList<>();
    private ArrayList<Prensador> dobrador = new ArrayList<>();
    private ArrayList<Prensador> cortador = new ArrayList<>();

    public ArrayList<Prensador> getPrensador() {
        return prensador;
    }

    public void setPrensador(ArrayList<Prensador> prensador) {
        this.prensador = prensador;
    }

    public ArrayList<Prensador> getDobrador() {
        return dobrador;
    }

    public void setDobrador(ArrayList<Prensador> dobrador) {
        this.dobrador = dobrador;
    }

    public ArrayList<Prensador> getCortador() {
        return cortador;
    }

    public void setCortador(ArrayList<Prensador> cortador) {
        this.cortador = cortador;
    }

    public Fabrica() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
