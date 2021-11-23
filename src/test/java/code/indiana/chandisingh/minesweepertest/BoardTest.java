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

    @Test
    public void testSetNumOfTiles(){
        Board testBoard=new Board();
        testBoard.setNumOfTiles(2,3);
        assertEquals(6,testBoard.getNumOfTiles(),"Does not get/set correct number of tiles");
    }
    @Test
    public void testGetNumOfTiles(){
        Board testBoard=new Board();
        testBoard.setNumOfTiles(2,3);
        assertEquals(6,testBoard.getNumOfTiles(),"Does not get/set correct number of tiles");
    }

    @Test
    public void testSetTilesChecked(){
        Board testBoard=new Board();
        testBoard.setTilesChecked(2);
        assertEquals(2,testBoard.getTilesChecked(),"Does not set correct number of tiles checked");
    }
    @Test
    public void testGetTilesChecked(){
        Board testBoard=new Board();
        testBoard.setTilesChecked(2);
        assertEquals(2,testBoard.getTilesChecked(),"Does not set correct number of tiles checked");
    }

    @Test
    public void testSetBombsRevealed(){
        Board testBoard=new Board();
        testBoard.setBombsRevealed(2);
        assertEquals(2,testBoard.getBombRevealed(),"Incorrect number of bombs revealed set");
    }
    @Test
    public void testGetBombsRevealed(){
        Board testBoard=new Board();
        testBoard.setBombsRevealed(2);
        assertEquals(2,testBoard.getBombRevealed(),"Incorrect number of bombs revealed set");
    }

    @Test
    public void testCheckBoardClear(){
        Board testBoard=new Board();
        testBoard.setTilesChecked(6);
        testBoard.setNumOfTiles(2,3);
        assertEquals(true,testBoard.checkBoardClear(),"Does not show when board clear");
    }
    @Test
    public void testSetNumOfBombs(){
        Board testBoard=new Board();
        testBoard.setNumOfBombs(2);
        assertEquals(2,testBoard.getNumOfBombs(),"Incorrect number of bombs");
    }
    @Test
    public void testGetNumOfBombs(){
        Board testBoard=new Board();
        testBoard.setNumOfBombs(2);
        assertEquals(2,testBoard.getNumOfBombs(),"Incorrect number of bombs");
    }
    @Test
    public void testSetBombsPlaced(){
        Board testBoard=new Board();
        testBoard.setBombsPlaced(2);
        assertEquals(2,testBoard.getBombsPlaced(),"Incorrect number of bombs placed");
    }
    @Test
    public void testGetBombsPlaced(){
        Board testBoard=new Board();
        testBoard.setBombsPlaced(2);
        assertEquals(2,testBoard.getBombsPlaced(),"Incorrect number of bombs placed");
    }


}
