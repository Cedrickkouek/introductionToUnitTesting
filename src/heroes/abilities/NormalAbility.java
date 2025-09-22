package heroes.abilities;

import grid.Grid;

public class NormalAbility extends Ability {

    public NormalAbility() {
        super("Normal");
    }

    @Override
    public void behaviour(Grid grid) {
        // Point cell2 = GridReader.getEmptyCell(grid)
        // grid.updateCell(cell2, symbol)

        setUsed(true);
    }
}
