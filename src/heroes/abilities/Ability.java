package heroes.abilities;

import grid.Grid;

public abstract class Ability {
    private final String name;
    private boolean used = false;

    public Ability(String name) {
        this.name = name;
    }

    protected abstract void behaviour(Grid grid);

    public final String getName() {
        return name;
    }

    public void use(Grid grid) {
        behaviour(grid);
        setUsed(true);
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

}
