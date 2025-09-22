package heroes;

import heroes.abilities.NormalAbility;

public class Batman extends Hero {
    public Batman() {
        super("Batman", 'B');
        registerAbilities();
    }


    @Override
    protected void registerAbilities() {
        registerAbility(new NormalAbility());
    }
}
