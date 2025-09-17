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

    public void updateCell(Point cell, char value) {
        grid[cell.x][cell.y] = value;
    }

    public void fillWith(char value) {
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < getSize(); j++) {
                grid[i][j] = value;
            }
        }
    }

    public boolean isInBounds(Point cell) {
        return (cell.x >= 0 && cell.x < getSize()) && (cell.y >= 0 && cell.y < getSize());
    }
}
