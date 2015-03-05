package com.thoughtworks.tic_tac_toe;

import java.io.PrintStream;

public class Board {

    private PrintStream printStream;

    public Board(PrintStream printStream){
        this.printStream = printStream;
    }

    public void drawBoard() {
        printStream.println(" | | ");
        printStream.println("_____");
        printStream.println(" | | ");
        printStream.println("_____");
        printStream.println(" | | ");
    }
}
