package com.thoughtworks.tic_tac_toe;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ComputerPlayerTest {
    private Board board = new Board(mock(PrintStream.class));
    private ComputerPlayer computerPlayer = new ComputerPlayer("O", board);

    @Test
    public void shouldHaveComputerChooseTheEmptyLocationOnTheBoard(){
        board.setNewPosition("1","X");
        board.setNewPosition("2","X");
        board.setNewPosition("3","X");
        board.setNewPosition("4","X");
        board.setNewPosition("5","X");
        board.setNewPosition("6","X");
        board.setNewPosition("7","X");
        board.setNewPosition("8","X");

        computerPlayer.makeMoveToEmptySpace();

        assertEquals(board.areAllSlotsFull(), true);
    }

}