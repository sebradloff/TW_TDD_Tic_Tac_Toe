package com.thoughtworks.tic_tac_toe;

import org.junit.Test;

import java.io.PrintStream;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameTest {
    private Board board = new Board(mock(PrintStream.class));
    private Game game = new Game(board);

    @Test
    public void shouldCallDrawBoardWhenStartIsCalled(){
//        Board board1 = mock(Board.class);

        game.start();

        verify(board, times(1)).drawBoard();
    }
}