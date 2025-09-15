import java.awt.*;

public class Grid {
    private final  char[][] grid;

    public Grid(){
        grid = new char[4][4];
    }

    public char readCell(Point cell){
        return grid[cell.x][cell.y];
    }
}
