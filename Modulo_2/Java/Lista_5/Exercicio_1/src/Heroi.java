public class Heroi {
    private int id;
    private String nome;
    private int quantidadeMoedasDeOuro;
    public Heroi(int id, String nome, int quantidadeMoedasDeOuro){
        this.id = id;
        this.nome = nome;
        this.quantidadeMoedasDeOuro = quantidadeMoedasDeOuro;
    }
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeMoedasDeOuro() {
        return quantidadeMoedasDeOuro;
    }

    public void setQuantidadeMoedasDeOuro(int quantidadeMoedasDeOuro) {
        this.quantidadeMoedasDeOuro = quantidadeMoedasDeOuro;
    }
}
