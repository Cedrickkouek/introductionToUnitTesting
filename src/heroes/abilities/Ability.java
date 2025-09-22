package heroes.abilities;

public abstract class Ability {
    private final String name;

    public Ability(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

}
