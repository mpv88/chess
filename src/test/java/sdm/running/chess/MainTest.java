package sdm.running.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void returnsStartupMessage() {
        Main main = new Main();

        assertEquals("Chess application is running.", main.startupMessage());
    }
}