package hw4.maze;

import java.util.ArrayList;

public class Grid {
    private ArrayList<Row> rows;

    public Grid() {
        this.rows = new ArrayList<>();
    }

    public void addRow(Row row) {
        this.rows.add(row);
    }

    public Row getRow(int index) {
        return rows.get(index);
    }

    public void setRow(int index, Row row) {
        this.rows.set(index, row);
    }

    public int getGridSize() {
        return rows.size();
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        return rows.toString();
    }
}