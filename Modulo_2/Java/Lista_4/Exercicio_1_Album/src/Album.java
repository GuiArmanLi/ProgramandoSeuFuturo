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
}