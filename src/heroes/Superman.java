package heroes;

import heroes.abilities.Ability;
import heroes.abilities.HeatVisionAbility;
import heroes.abilities.NormalAbility;

import java.util.ArrayList;

public class Superman extends Hero {
    public Superman() {
        super("Superman", 'S');
        registerAbilities();
    }

    @Override
    protected void registerAbilities() {
        registerAbility(new NormalAbility());
        registerAbility(new HeatVisionAbility());
    }
}
