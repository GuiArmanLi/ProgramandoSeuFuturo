public class Main {
    public static void main(String[] args) {
        Album playGay = new Album();

        playGay.musicas.add(new Musica("Vitin", 6, 365));
        playGay.musicas.add(new Musica("Vito", 10, 240));
        playGay.musicas.add(new Musica("Vitao", 1000, 400));

        System.out.println("Musica mais popular: " + playGay.getMusicaMaiorPopularidade().getNome());
        System.out.println("Musica mais curta: " + playGay.getMusicaMenorDuracao().getNome());
    }
}