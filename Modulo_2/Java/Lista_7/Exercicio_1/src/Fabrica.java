import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private int id;

    private List<Operario> operarios;

    public Fabrica(){
        this.operarios = new ArrayList<>();
    }

    public List<Operario> getOperarios() {
        return operarios;
    }
    public void addOperarios(Operario operario){
        this.operarios.add(operario);
    }

    public void escravizar(){
        for (int i = 0; i < operarios.size(); i++) {
            operarios.get(i).produzir();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
