package com.thoughtworks.tic_tac_toe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
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

    @Test
    public void shouldReturnFalseSinceMarkerAlreadyAtThatPosition(){
        board.setNewPosition("1","0");
        assertEquals(board.setNewPosition("1", "X"), false);

    }

    @Test
    public void shouldReturnTrueSinceSpaceIsEmptyAtThatPosition(){
        assertEquals(board.setNewPosition("1", "X"), true);
    }

    @Test
    public void shouldReturnFalseWhenUserInputIsOutOfRange(){
        assertEquals(board.setNewPosition("10", "X"), false);
    }

    @Test
    public void shouldReturnTrueWhenAllSpotsAreFull(){
        board.setNewPosition("1","X");
        board.setNewPosition("2","X");
        board.setNewPosition("3","X");
        board.setNewPosition("4","X");
        board.setNewPosition("5","X");
        board.setNewPosition("6","X");
        board.setNewPosition("7","X");
        board.setNewPosition("8","X");
        board.setNewPosition("9","X");

        assertEquals(board.areAllSlotsFull(), true);
    }
    @Test
    public void shouldReturnFalseWhenNotAllSpotsAreFull(){
        assertEquals(board.areAllSlotsFull(), false);
    }

    @Test
    public void shouldReturnTrueIfTopLineHasThreeOfSameMarkerInARow(){
        board.setNewPosition("1","X");
        board.setNewPosition("2","X");
        board.setNewPosition("3", "X");

        assertEquals(board.threeInARow("X"), true);
    }

    @Test
    public void shouldReturnTrueIfSecondLineHasThreeOfSameMarkerInARow(){
        board.setNewPosition("4","X");
        board.setNewPosition("5","X");
        board.setNewPosition("6", "X");

        assertEquals(board.threeInARow("X"), true);
    }

    @Test
    public void shouldReturnTrueIfThirdLineHasThreeOfSameMarkerInARow(){
        board.setNewPosition("7","X");
        board.setNewPosition("8","X");
        board.setNewPosition("9", "X");

        assertEquals(board.threeInARow("X"), true);
    }

    @Test
    public void shouldReturnTrueIfFirstColumnHasThreeOfSameMarkerInARow(){
        board.setNewPosition("1","X");
        board.setNewPosition("4","X");
        board.setNewPosition("7", "X");

        assertEquals(board.threeInARow("X"), true);
    }

    @Test
    public void shouldReturnTrueIfSecondColumnHasThreeOfSameMarkerInARow(){
        board.setNewPosition("2","X");
        board.setNewPosition("5","X");
        board.setNewPosition("8", "X");

        assertEquals(board.threeInARow("X"), true);
    }

    @Test
    public void shouldReturnTrueIfThirdColumnHasThreeOfSameMarkerInARow(){
        board.setNewPosition("3","X");
        board.setNewPosition("6","X");
        board.setNewPosition("9", "X");

        assertEquals(board.threeInARow("X"), true);
    }

    @Test
    public void shouldReturnTrueIfLeftToRightDiagonalHasThreeOfSameMarkerInARow(){
        board.setNewPosition("1","X");
        board.setNewPosition("5","X");
        board.setNewPosition("9", "X");

        assertEquals(board.threeInARow("X"), true);
    }

    @Test
    public void shouldReturnTrueIfRightToLeftDiagonalHasThreeOfSameMarkerInARow(){
        board.setNewPosition("3","X");
        board.setNewPosition("5","X");
        board.setNewPosition("7", "X");

        assertEquals(board.threeInARow("X"), true);
    }
}