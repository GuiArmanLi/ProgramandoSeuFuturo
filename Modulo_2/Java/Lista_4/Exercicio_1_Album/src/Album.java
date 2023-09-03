import java.util.ArrayList;

public class Album {
    private String nome;
    private String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList<>();

    public Musica getMusicaMaiorPopularidade(){
        int maiorPopularidade = 0;
        int index = 0;

        for (int i = 0; i < musicas.size(); i++) {
            if(musicas.get(i).getPopularidade() > maiorPopularidade){
                maiorPopularidade = musicas.get(i).getPopularidade();
                index = i;
            }
        }
        return musicas.get(index);
    }

    public Musica getMusicaMenorDuracao(){
        int musicaMenorDuracao = 10000;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if(musicas.get(i).getDuracaoEmSegundos() < musicaMenorDuracao){
                musicaMenorDuracao = musicas.get(i).getDuracaoEmSegundos();
                index = i;
            }
        }
        return musicas.get(index);
    }

    public Album (){}

    public Album(String nome, String nomeArtista, ArrayList<Musica> musicas) {
        this.nome = nome;
        this.nomeArtista = nomeArtista;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}