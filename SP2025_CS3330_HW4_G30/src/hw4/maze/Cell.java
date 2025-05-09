package hw4.maze;


/**
 * Represents a single cell in the maze.
 */
public class Cell {
    private CellComponents left;
    private CellComponents right;
    private CellComponents up;
    private CellComponents down;

    public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;
    }

    public CellComponents getLeft() { return left; }
    public CellComponents getRight() { return right; }
    public CellComponents getUp() { return up; }
    public CellComponents getDown() { return down; }

    public void setLeft(CellComponents left) { this.left = left; }
    public void setRight(CellComponents right) { this.right = right; }
    public void setUp(CellComponents up) { this.up = up; }
    public void setDown(CellComponents down) { this.down = down; }

    @Override
    public String toString() {
        return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
    }
}