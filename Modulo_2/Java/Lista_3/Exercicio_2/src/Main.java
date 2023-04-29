public class Main {
    public static void main(String[] args) {
        Album playGay = new Album();

        Musica pabloVitar = new Musica("Vitin",6, 365);
        playGay.musicas.add(pabloVitar);

        Musica pabloVitinho = new Musica("Vito",10, 240);
        playGay.musicas.add(pabloVitinho);

        Musica xingXong = new Musica("Vitao",1000, 400);
        playGay.musicas.add(xingXong);

        System.out.println("A musica com maior popularidade é: " + playGay.getMusicaMaiorPopularidade().nome);

        System.out.println("A musica com menor duracao é: " + playGay.getMusicaMenorDuracao().nome);
    }
}