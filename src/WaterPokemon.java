public class WaterPokemon extends Pokemon{
    // variables
    private String type;
    private String weakTo;
    private String strongAgainst;

    // constructor
    public WaterPokemon(String name, int level, int hp) {
        super(name, level, hp);
        this.type = "Water";
        this.weakTo = "Electric";
        this.strongAgainst = "Fire";
    }

    // methods / unique skills
    public void hydroPump() {
        System.out.println(name + " uses Hydro Pump!");
    }

    public void waterfall() {
        System.out.println(name + " uses Waterfall!");
    }

    // override
    @Override
    public void plays() {
        System.out.println(name + " splashes in a pond!");
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
