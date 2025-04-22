package hw4.maze;

import java.util.ArrayList;
/**
 * Represents a row in the maze, consisting of multiple cells.
 */
public class Row {
    private ArrayList<Cell> cells;

    public Row() {
        this.cells = new ArrayList<>();
    }

    public void addCell(Cell cell) {
        this.cells.add(cell);
    }

    public Cell getCell(int index) {
        return cells.get(index);
    }

    public void setCell(int index, Cell cell) {
        this.cells.set(index, cell);
    }

    public int getCellsSize() {
        return cells.size();
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }

    @Override
    public String toString() {
        return cells.toString();
    }
}