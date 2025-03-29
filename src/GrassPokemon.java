public class GrassPokemon extends Pokemon{
    // variables
    private String type;
    private String weakTo;
    private String strongAgainst;

    // constructor
    public GrassPokemon(String name, int level, int hp) {
        super(name, level, hp);
        this.type = "Grass";
        this.weakTo = "Fire";
        this.strongAgainst = "Electric";
    }

    // methods / unique skills
    public void leafStorm() {
        System.out.println(name + " uses Leaf Storm!");
    }

    public void vineWhip() {
        System.out.println(name + " uses Vine Whip!");
    }

    // override
    @Override
    public void plays() {
        System.out.println(name + " climbs into a tree!");
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
