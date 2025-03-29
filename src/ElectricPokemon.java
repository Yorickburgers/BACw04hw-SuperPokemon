public class ElectricPokemon extends Pokemon{
    //variables
    private String type;
    private String weakTo;
    private String strongAgainst;

    //constructor
    public ElectricPokemon(String name, int level, int hp) {
        super(name, level, hp);
        this.type = "Electric";
        this.weakTo = "Grass";
        this.strongAgainst = "Water";
    }

    //methods / unique skills
    public void thunderbolt() {
        System.out.println(name + " uses Thunderbolt!");
    }

    public void voltTackle() {
        System.out.println(name + " uses VoltTackle!");
    }

    // override
    @Override
    public void plays() {
        System.out.println(name + " showers sparks in the air!");
    }

    // getters en setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeakTo() {
        return weakTo;
    }

    public void setWeakTo(String weakTo) {
        this.weakTo = weakTo;
    }

    public String getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(String strongAgainst) {
        this.strongAgainst = strongAgainst;
    }
}
