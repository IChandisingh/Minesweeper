package code.indiana.chandisingh.minesweepertest;
import code.indiana.chandisingh.minesweeper.Bomb;
import code.indiana.chandisingh.minesweeper.Empty;
import code.indiana.chandisingh.minesweeper.Tile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TileTest {

    @Test
    public void testGetValue(){
        Tile bomb = new Bomb();
        Tile empty = new Empty();
        empty.setValue(0);
        bomb.setValue(0);
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
    @Test
    public void testSetTileType(){
        Tile bomb = new Bomb();
        Tile empty = new Empty();
        bomb.setTileType();
        empty.setTileType();
        assertEquals(true,bomb.getTileType(),"incorrect tile type set");
        assertEquals(false,empty.getTileType(),"incorrect tile type set");
    }
    @Test
    public void testGetTileType(){
        Tile bomb = new Bomb();
        Tile empty = new Empty();
        bomb.setTileType();
        empty.setTileType();
        assertEquals(true,bomb.getTileType(),"incorrect tile type set");
        assertEquals(false,empty.getTileType(),"incorrect tile type set");
    }

}
