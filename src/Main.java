import heroes.Batman;
import heroes.Hero;
import heroes.Superman;
import heroes.abilities.Ability;
import heroes.abilities.HeatVisionAbility;
import heroes.abilities.NormalAbility;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Batman batman = new Batman();
        Superman superman = new Superman();

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(batman);
        heroes.add(superman);

        while (true){
            for (Hero hero : heroes) {
                //Ability ability = AbilityReader.(hero);
            }
//            if (grid.checkWinner()){
//
//            }
        }

    }
}