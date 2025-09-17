import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
    private static final int GRID_SIZE = 4;
    private static final char DEFAULT_CARACTER = ' ';

    private Grid grid;

    @BeforeEach
    public void setUp() {
        grid = new Grid(GRID_SIZE);
    }

    @Test
    public void readCellInEmptyGridTest() {
        assertEquals(Character.MIN_VALUE, grid.readCell(getRandomCell()));
    }

    @Test
    public void testGetSizeShouldReturnGridSize() {
        assertEquals(4, grid.getSize());
    }

    @Test
    public void voidTestUpdateCellShouldChangeTheValueInTheMatrix(){
        Point cell = getRandomCell();

        grid.updateCell(cell, DEFAULT_CARACTER);

        assertEquals(DEFAULT_CARACTER, grid.readCell(cell));
    }

    @Test
    public void testFillGridShouldEveryCellWithCharacter(){
        grid.fillWith(DEFAULT_CARACTER);

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                assertEquals(DEFAULT_CARACTER, grid.readCell(new Point(i, j)));
            }
        }
    }

    private Point getRandomCell(){
        Random random = new Random();

        int x = random.nextInt(GRID_SIZE);
        int y = random.nextInt(GRID_SIZE);

        return new Point(x, y);
    }
}