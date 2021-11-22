package code.indiana.chandisingh.minesweepertest;

import code.indiana.chandisingh.minesweeper.Board;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    public void checkBombsRevealedTest(){
        Board testBoard=new Board();
        testBoard.setTilesChecked(0);
        assertEquals(false,testBoard.checkBoardClear(),"Did not result in correct boolean");
    }

}
