package heroes;

import heroes.abilities.Ability;

import java.util.ArrayList;

public abstract class Hero {
    private final String name;
    private final char symbol;
    private ArrayList<Ability> abilities;

    public Hero(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    protected abstract void registerAbilities();

    public char getSymbol() {
        return symbol;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public Ability getAbility(int index){
        return abilities.get(index);
    }

    public void registerAbility(Ability ability){
        abilities.add(ability);
    }
}
