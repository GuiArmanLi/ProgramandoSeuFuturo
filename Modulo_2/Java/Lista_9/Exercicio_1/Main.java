public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        pokedex.adicionarPokemon(new Pokemon("caralhassauro", "planta"));
        pokedex.adicionarPokemon(new Pokemon("charmaralho", "fogo"));
        pokedex.adicionarPokemon(new Pokemon("bulbadao", "agua"));

        for (Pokemon pokemon : pokedex.getPokemons().values()) {
            System.out.println(pokemon);
        }
    }
}