import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
    private static final  int GRID_SIZE = 4;

    private Grid grid;

    @BeforeEach
    public void setUp() {
        grid = new Grid(GRID_SIZE);
    }

    @Test
    public void readCellInEmptyGridTest() {
        assertEquals(Character.MIN_VALUE, grid.readCell(new Point(0, 0)));
    }

    @Test
    public void testGetSizeShouldReturnGridSize() {
        assertEquals(4, grid.getSize());
    }
}