public class Main {
    public static void main(String[] args) {
    // instanties
    FirePokemon magmar = new FirePokemon("Magmar", 27, 84);
    WaterPokemon gyarados = new WaterPokemon("Gyarados", 32, 124);
    ElectricPokemon jolteon = new ElectricPokemon("Jolteon", 12, 43);
    GrassPokemon bellsprout = new GrassPokemon("Bellsprout", 5, 22);

    // methods
    magmar.flamethrower();
    gyarados.waterfall();
    jolteon.plays();
    bellsprout.leafStorm();
    magmar.pound();
    gyarados.rebels();
    jolteon.eats();
    magmar.eats();
    bellsprout.eats();
    gyarados.eats();
    }
}