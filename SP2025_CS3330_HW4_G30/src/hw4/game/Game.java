package hw4.game;

import hw4.maze.*;
import java.util.Random;

/**
 * Represents the core game logic and initializes grid.
 */
public class Game {
    private Grid grid;
    private final Random rand = new Random();

    public Game() {
        this.grid = generateRandomGrid();
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     * Generates a random NxN grid between 3x3 and 7x7 with the constraints:
     * One EXIT on the leftmost column
     * Each cell must have at least one APERTURE
     */
    private Grid generateRandomGrid() {
        int size = rand.nextInt(5) + 3; // Random size between 3 and 7
        Grid grid = new Grid();
        int exitRow = rand.nextInt(size);

        for (int i = 0; i < size; i++) {
            Row row = new Row();
            for (int j = 0; j < size; j++) {
                CellComponents left = (j == 0 && i == exitRow) ? CellComponents.EXIT : randomComponent();
                CellComponents right = randomComponent();
                CellComponents up = randomComponent();
                CellComponents down = randomComponent();

                if (left != CellComponents.APERTURE && right != CellComponents.APERTURE &&
                    up != CellComponents.APERTURE && down != CellComponents.APERTURE &&
                    left != CellComponents.EXIT) {
                    right = CellComponents.APERTURE;
                }

                row.addCell(new Cell(left, right, up, down));
            }
            grid.addRow(row);
        }
        return grid;
    }

    private CellComponents randomComponent() {
        int pick = rand.nextInt(2);
        return pick == 0 ? CellComponents.WALL : CellComponents.APERTURE;
    }

    @Override
    public String toString() {
        return grid.toString();
    }
}


