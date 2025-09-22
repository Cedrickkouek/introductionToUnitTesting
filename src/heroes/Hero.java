package heroes;

import heroes.abilities.Ability;

import java.util.ArrayList;

public class Hero {
    private final String name;
    private final char symbol;
    private ArrayList<Ability> abilities;

    public Hero(String name, char symbol, ArrayList<Ability> abilities) {
        this.name = name;
        this.symbol = symbol;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public Ability getAbility(int index){
        return abilities.get(index);
    }
}
