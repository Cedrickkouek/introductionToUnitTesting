import java.awt.*;

public class Grid {
    private final  char[][] grid;

    public Grid(int seize){
        grid = new char[seize][seize];
    }

    public char readCell(Point cell){
        return grid[cell.x][cell.y];
    }

    public int getSize() {
        return grid.length;
    }
}
