package com.thoughtworks.tic_tac_toe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class GameTest {
    private PrintStream printStream;
    private Board board = new Board(mock(PrintStream.class));
    private Game game;
    private BufferedReader reader;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
        reader = mock(BufferedReader.class);
        game =  new Game(board,printStream,reader);
    }

    @Test
    public void shouldCallDrawBoardWhenStartIsCalled(){
        Board board1 = mock(Board.class);
        Game game1 = new Game(board1, printStream, reader);

        game1.start();

        verify(board1, times(1)).drawBoard();
    }

    @Test
    public void shouldPromptPlayerToMakeTheFirstMove(){

        game.promptUserToMakeMove();

        verify(printStream).println("Please enter a number between 1 and 9 to make a move:");
    }

    @Test
    public void shouldGetPlayerInput() throws IOException {
        when(reader.readLine()).thenReturn("1");

        assertThat(game.getPlayerInput(), is("1"));
    }
}