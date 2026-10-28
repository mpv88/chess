package sdm.running.chess;

public class Main {

    public static void main(String[] args) {
        System.out.println(startupMessage());

        Board board = new Board();
    }

    static String startupMessage() {
        return "Chess application is running.";
    }
}