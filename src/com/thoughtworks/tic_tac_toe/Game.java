package com.thoughtworks.tic_tac_toe;

import java.io.PrintStream;

public class Game {
    private Board board;
    private PrintStream printStream;

    public Game(Board board, PrintStream printStream) {
        this.board = board;
        this.printStream = printStream;
    }

    public void start() {
        board.drawBoard();
    }

    public void promptUserToMakeMove() {
        printStream.println("Please make a move:");
    }
}
