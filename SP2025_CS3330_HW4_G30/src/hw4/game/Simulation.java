package hw4.game;

import hw4.maze.*;
import hw4.player.Player;

/**
 * Simulation class to demonstrate the game functionality.
 */
public class Simulation {
    /**
     * Entry point for the simulation. Initializes game, player, and shows movement.
     */
    public static void main(String[] args) {
        Game game = new Game();
        Grid grid = game.getGrid();
        int size = grid.getGridSize();
        Player player = new Player(size - 1, size - 1);

        System.out.println("Initial Player Position: " + player);
        printGrid(grid, player);

        player.moveUp();
        System.out.println("After moving up: " + player);
        printGrid(grid, player);

        player.moveLeft();
        System.out.println("After moving left: " + player);
        printGrid(grid, player);
    }

    /**
     * Prints the grid state, showing 'A' for the player, 'E' for exit cells, and 'S' for other cells.
     *
     * @param grid the maze grid
     * @param player the player within the grid
     */
    public static void printGrid(Grid grid, Player player) {
        for (int i = 0; i < grid.getGridSize(); i++) {
            Row row = grid.getRow(i);
            for (int j = 0; j < row.getCellsSize(); j++) {
                if (i == player.getCurrentRowIndex() && j == player.getCurrentCellIndex()) {
                    System.out.print("A ");
                } else if (row.getCell(j).getLeft() == CellComponents.EXIT) {
                    System.out.print("E ");
                } else {
                    System.out.print("S ");
                }
            }
            System.out.println();
        }
    }
}
