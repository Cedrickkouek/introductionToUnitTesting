package heroes.abilities;

import grid.Grid;

public class HeatVisionAbility extends Ability {
    public HeatVisionAbility() {
        super("Heat Vision");
    }

    @Override
    protected void behaviour(Grid grid) {
        //Point cell = GridReader.getCellWithSymbol(grid, symbol);
        //grid.updateCell(cell, ' ');

        //NormalAbility normalAbility = new NormalAbility();
        //normalAbility.use(grid);

        setUsed(true);
    }

}
