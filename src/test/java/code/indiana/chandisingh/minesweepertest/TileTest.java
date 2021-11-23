package code.indiana.chandisingh.minesweepertest;
import code.indiana.chandisingh.minesweeper.Bomb;
import code.indiana.chandisingh.minesweeper.Empty;
import code.indiana.chandisingh.minesweeper.Tile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TileTest {
    /*
    @Test
    public void testCheckTileType(){
        Tile tile=new Tile();
        tile.setTileType(true);
        assertEquals(true,tile.checkTileType(),"Incorrect tile type returned.");
    }

     */

    @Test
    public void testGetValue(){
        Tile bomb = new Bomb();
        Tile empty = new Empty();
        empty.setValue(0);
        assertEquals(9,bomb.getValue(),"Returns incorrect value");
        assertEquals(0,empty.getValue(),"Returns incorrect value");
    }
    @Test
    public void testSetValue(){
        Tile bomb = new Bomb();
        Tile empty = new Empty();
        empty.setValue(0);
        bomb.setValue(0);
        assertEquals(9,bomb.getValue(),"Returns incorrect value");
        assertEquals(0,empty.getValue(),"Returns incorrect value");
    }
     /*
    public boolean setTileType(){
        return false;
    }

     */
}
