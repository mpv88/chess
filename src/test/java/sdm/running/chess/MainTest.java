package sdm.running.chess;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void returnsStartupMessage() {
        assertEquals("Chess application is running.", Main.startupMessage());
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

    @ParameterizedTest
    @CsvSource({
            "A7, 1, 0",
            "B8, 0, 1",
            "D3, 5, 3",
            "E6, 2, 4",
            "C1, 7, 2",
            "G7, 1, 6",
    })
    void testCoordinateConversion(String notation, int expectedRow, int expectedCol) {
        Board board = new Board();
        int[] actualIndices = board.parseCoordinates(notation);
        assertArrayEquals(new int[] {expectedRow, expectedCol}, actualIndices, "Failed for notation: " + notation);
    }

    @ParameterizedTest
    @ValueSource(strings= {"I8", "A9"})
    void testInvalidNotationsThrowException(String invalidNotation) {
        Board board = new Board();
        assertThrows(IllegalArgumentException.class, () -> {
            board.parseCoordinates(invalidNotation);
        }, "Should have thrown an exception for invalid notation: " + invalidNotation);
    }

}