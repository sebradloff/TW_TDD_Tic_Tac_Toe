package com.thoughtworks.tic_tac_toe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;


import static org.mockito.Mockito.mock;


public class BoardTest {
    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldPrintBoard(){
        PrintStream printStream = mock(PrintStream.class);
        board.drawBoard();

        printStream.println(" | | ");
        printStream.println("_____");
        printStream.println(" | | ");
        printStream.println("_____");
        printStream.println(" | | ");
    }
}