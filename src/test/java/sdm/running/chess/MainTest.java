package sdm.running.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void returnsStartupMessage() {
        Main main = new Main();
        assertEquals("Chess application is running.", main.startupMessage());
    }

    @Test
    void shouldHaveEightRows() {
        Board board = new Board();
        assertEquals(8, board.getRowCount(), "A standard chessboard must have 8 rows");
    }

    @Test
    void shouldHaveEightColumns() {
        Board board = new Board();
        assertEquals(8, board.getColumnCount(), "A standard chessboard must have 8 columns");
    }
}