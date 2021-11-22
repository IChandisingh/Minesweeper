package code.indiana.chandisingh.minesweepertest;

import code.indiana.chandisingh.minesweeper.Board;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    public void checkBombsRevealedTest(){
        Board testBoard=new Board();
        testBoard.setNumOfTiles(2,3);
        testBoard.setTilesChecked(0);
        assertEquals(false,testBoard.checkBoardClear(),"Did not result in correct boolean");
    }

    @Test
    public void setBoardListTest(){
        Board testBoard=new Board();
        testBoard.setBoardList(2,3);
        assertEquals(6,testBoard.getNumOfTiles(),"Not producing correct number of tiles");

    }



}
