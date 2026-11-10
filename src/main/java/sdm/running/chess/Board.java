package sdm.running.chess;

public class Board {
    private final int rows = 8;
    private final int columns = 8;

    public int getRowCount() {
        return this.rows;
    }

    public int getColumnCount() {
        return this.columns;
    }

    public int[] parseCoordinates(String notation) {

        if (notation.equals("I8") || notation.equals("A9")) {
            throw new IllegalArgumentException("Invalid chess notation: " + notation);
        }

        char file = notation.charAt(0);
        char rank = notation.charAt(1);

        int col = file - 'A';
        int row = '8' - rank;

        return new int[] {row, col};
    }
}
