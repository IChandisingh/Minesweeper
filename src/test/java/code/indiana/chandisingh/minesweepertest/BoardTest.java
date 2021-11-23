package code.indiana.chandisingh.minesweepertest;

import code.indiana.chandisingh.minesweeper.Board;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    public void testCheckBombsRevealed(){
        Board testBoard=new Board();
        testBoard.setNumOfTiles(2,3);
        testBoard.setTilesChecked(0);
        assertEquals(false,testBoard.checkBoardClear(),"Did not result in correct boolean");
    }

    @Test
    public void testSetBoardList(){
        Board testBoard=new Board();
        testBoard.setBoardList(2,3);
        assertEquals(6,testBoard.getNumOfTiles(),"Not producing correct number of tiles");

    }

    @Test
    public void testEditBoardList(){
        Board testBoard=new Board();
        testBoard.setBoardList(2,3);
        testBoard.setTilesChecked(0);
        testBoard.editBoardList(1,1);
        assertEquals(1, testBoard.getTilesChecked(),"Does not add to tiles checked counter");
    }



}
