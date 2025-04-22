package hw4.player;

import hw4.maze.Grid;
import hw4.maze.Row;
import hw4.maze.Cell;

/**
 * Represents the player navigating through the maze.
 */
public class Player {
    private int currentRow;
    private int currentCell;

    public Player(int row, int cell) {
        this.currentRow = row;
        this.currentCell = cell;
    }

    public int getCurrentRowIndex() {
        return currentRow;
    }

    public int getCurrentCellIndex() {
        return currentCell;
    }

    public Row getCurrentRow(Grid grid) {
        return grid.getRow(currentRow);
    }

    public Cell getCurrentCell(Grid grid) {
        return grid.getRow(currentRow).getCell(currentCell);
    }

    public void moveUp() {
        currentRow--;
    }

    public void moveDown() {
        currentRow++;
    }

    public void moveLeft() {
        currentCell--;
    }

    public void moveRight() {
        currentCell++;
    }

    @Override
    public String toString() {
        return "Player [row=" + currentRow + ", cell=" + currentCell + "]";
    }
}