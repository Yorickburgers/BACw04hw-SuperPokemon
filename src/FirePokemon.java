public class FirePokemon extends Pokemon {
    // variables
    private String type;
    private String weakTo;
    private String strongAgainst;

    // constructor
    public FirePokemon(String name, int level, int hp) {
        super(name, level, hp);
        this.type = "Fire";
        this.weakTo = "Water";
        this.strongAgainst = "Grass";
    }

    // methods / unique skills
    public void flamethrower() {
        System.out.println(name + " uses Flamethrower!");
    }

    public void firePunch() {
        System.out.println(name + " uses Fire Punch!");
    }

    // override
    @Override
    public void plays() {
        System.out.println(name + " juggles a tiny ember!");
    }

    // getters en setters - een setter voor deze variabelen is misschien wat onlogisch maar wellicht is er een aanval die tijdelijk de type verandert of de strengths en weaknesses...
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
