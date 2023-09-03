public class Musica {
    private String nome;
    private int duracaoEmSegundos;
    private int popularidade;

    public Musica(){}

    public Musica(String nome, int popularidade, int duracao){
        this.nome = nome;
        this.popularidade = popularidade;
        this.duracaoEmSegundos = duracao;
    }

    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome){
        return this.nome = nome;
    }

    public int getDuracaoEmSegundos(){
        return this.duracaoEmSegundos;
    }
    public int setDuracaoEmSegundos(int duracaoEmSegundos){
        return this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getPopularidade(){
        return this.popularidade;
    }
    public int setPopularidade(int popularidade){
        return this.popularidade = popularidade;
    }
}