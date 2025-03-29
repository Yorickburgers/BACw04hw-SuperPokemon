public abstract class Pokemon {
    // variables
    protected String name;
    private int level;
    private int hp;

    // constructor
    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    // methods (Pokémon-acties)
    public void eats() {
        System.out.println(name + " eats a poffin!");
    }

    public void rebels() {
        System.out.println(name + " is loafing around.");
    }

    public void pound() {
        System.out.println(name + " uses pound.");
    }

    public void scratch() {
        System.out.println(name + " uses scratch.");
    }

    public abstract void plays();

    // getters en setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
