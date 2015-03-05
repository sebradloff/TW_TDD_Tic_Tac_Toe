package com.thoughtworks.tic_tac_toe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameTest {
    private PrintStream printStream;
    private Board board = new Board(mock(PrintStream.class));
    private Game game;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
        game =  new Game(board,printStream);
    }

    @Test
    public void shouldCallDrawBoardWhenStartIsCalled(){
        Board board1 = mock(Board.class);
        Game game1 = new Game(board1, printStream);

        game1.start();

        verify(board1, times(1)).drawBoard();
    }

    @Test
    public void shouldPromptPlayerToMakeTheFirstMove(){

        game.promptUserToMakeMove();

        verify(printStream).println("Please make a move:");
    }
}