public class Lampada {
    String material;
    String formato;
    String tipoDeLuz;
    boolean estado;

    public void ligar(){
        if(this.estado == false) {
            this.estado = true;
        }
    }
    public void desligar(){
        if(this.estado == true){
            this.estado = false;
        }
    }

    public void conferencia (){
        if(this.estado == true){
            System.out.println("ligada");
        }else {
            System.out.println("desligada");
        }
    }
}
