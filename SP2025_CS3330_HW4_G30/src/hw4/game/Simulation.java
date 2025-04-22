package hw4.game;

import hw4.maze.*;
import hw4.player.Player;

/**
 * Simulation class to run the game.
 */
public class Simulation {
    public static void main(String[] args) {
        Game game = new Game();
        Grid grid = game.getGrid();
        int size = grid.getGridSize();

        // Start the player at the bottom-right
        Player player = new Player(size - 1, size - 1);

        // Display initial grid state
        System.out.println("Initial Player Position: " + player);
        System.out.println("Grid:");
        System.out.println(grid);

        player.moveUp();
        System.out.println("After moving up: " + player);

        player.moveLeft();
        System.out.println("After moving left: " + player);
    }
}
