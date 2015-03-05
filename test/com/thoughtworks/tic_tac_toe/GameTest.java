package com.thoughtworks.tic_tac_toe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class GameTest {
    private PrintStream printStream;
    private Board board = new Board(mock(PrintStream.class));
    private Game game;
    private BufferedReader reader;
    private Player player1;
    private Player player2;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
        reader = mock(BufferedReader.class);
        player1 = new Player("X");
        player2 = new Player("O");
        game =  new Game(board,printStream,reader, player1, player2);
    }


    @Test
    public void shouldPromptPlayerToMakeTheFirstMove(){

        game.promptUserToMakeMove();

        verify(printStream).println("Please enter a number between 1 and 9 to make a move:");
    }


    @Test
    public void shouldHaveXInCorrectSlot(){
        board.setNewPosition("1","X");
        board.drawBoard();
        verify(printStream).print("X");
    }

    @Test
    public void shouldHavePlayer2PrintTheirMoveToTheCorrectSlot(){
        board.setNewPosition("1","O");
        board.drawBoard();
        verify(printStream).print("O");
    }

    @Test
    public void shouldReturnFalseWhenAllNineSpotsAreNotFilled(){
        assertEquals(game.isGameOver(),false);
    }

    @Test
    public void shouldReturnTrueWhenAllNineSpotsAreFilled(){
        board.setNewPosition("1","X");
        board.setNewPosition("2","X");
        board.setNewPosition("3","X");
        board.setNewPosition("4","X");
        board.setNewPosition("5","X");
        board.setNewPosition("6","X");
        board.setNewPosition("7","X");
        board.setNewPosition("8","X");
        board.setNewPosition("9","X");

        assertEquals(game.isGameOver(), true);
    }

}