package code.indiana.chandisingh.minesweepertest;
import code.indiana.chandisingh.minesweeper.Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GameTest {
    @Test
    public void testSetBombCheck(){
        Game testGame=new Game();
        testGame.setBombCheck(true);
        assertEquals(true,testGame.getBombCheck(),"Bomb check not set");
    }
    @Test
    public void testGetBombCheck(){
        Game testGame=new Game();
        testGame.setBombCheck(false);
        assertEquals(false,testGame.getBombCheck(),"Bomb check not set");
    }
    @Test
    public void testSetBoardCleared(){
        Game testGame=new Game();
        testGame.setBoardCleared(true);
        assertEquals(true,testGame.getBoardCleared(),"Board cleared not set");
    }
    @Test
    public void testGetBoardCleared(){
        Game testGame=new Game();
        testGame.setBoardCleared(false);
        assertEquals(false,testGame.getBoardCleared(),"Board cleared not set");
    }
    @Test
    public void testCheckContinueGame(){
        Game testGame=new Game();
        testGame.setBoardCleared(false);
        testGame.setBombCheck(false);
        assertEquals(true,testGame.checkContinueGame(),"continue check not working");
        testGame.setBoardCleared(true);
        testGame.setBombCheck(false);
        assertEquals(false,testGame.checkContinueGame(),"continue check not working");
        testGame.setBoardCleared(false);
        testGame.setBombCheck(true);
        assertEquals(false,testGame.checkContinueGame(),"continue check not working");
    }

    @Test
    public void testStartGame(){
        Game testGame=new Game();
        testGame.startGame(2,2);
        assertEquals(false,testGame.getBoardCleared(),"Game not starting correctly");
        assertEquals(false,testGame.getBombCheck(),"Game not starting correctly");
    }
    @Test
    public void testHaveTurn(){
        Game testGame=new Game();
        testGame.startGame(1,1);
        testGame.haveTurn(1,1);
        assertEquals(false,testGame.getBombCheck(),"turn incorrect");
        assertEquals(true,testGame.getBoardCleared(),"turn incorrect");
    }

}
