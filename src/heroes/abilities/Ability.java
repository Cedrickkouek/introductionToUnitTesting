package heroes.abilities;

import grid.Grid;

public abstract class Ability {
    private final String name;

    public Ability(String name) {
        this.name = name;
    }

    public abstract void use(Grid grid);

    public final String getName() {
        return name;
    }

}
