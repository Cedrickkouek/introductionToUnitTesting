import heroes.Hero;
import heroes.abilities.Ability;
import heroes.abilities.HeatVisionAbility;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Ability> supermanAbilities = new ArrayList<>();
        supermanAbilities.add(new HeatVisionAbility());

        ArrayList<Ability> batmanAbilities = new ArrayList<>();

        Hero superman = new Hero("Superman", 'S', supermanAbilities);
        Hero batman = new Hero("Batman", 'B', supermanAbilities);

        while (true){
            //Ability ability = AbilityReader.(hero);
        }

    }
}