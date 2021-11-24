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
    @Test
    public void testFlipTile(){
        Tile bomb = new Bomb();
        Tile empty = new Empty();
        bomb.flipTile();
        empty.flipTile();
        empty.setValue(0);
        assertEquals(false, bomb.getCovered(),"covered boolean not false");
        assertEquals(false, empty.getCovered(),"covered boolean not false");
        assertEquals(9, bomb.flipTile(),"covered boolean not false");
        assertEquals(0, empty.flipTile(),"covered boolean not false");
    }

    @Test
    public void testGetCovered(){
        Tile bomb = new Bomb();
        Tile empty = new Empty();
        bomb.setCovered(true);
        empty.setCovered(true);
        assertEquals(true, bomb.getCovered(),"covered boolean not false");
        assertEquals(true, empty.getCovered(),"covered boolean not false");
    }
    @Test
    public void testSetCovered(){
        Tile bomb = new Bomb();
        Tile empty = new Empty();
        bomb.setCovered(true);
        empty.setCovered(true);
        assertEquals(true, bomb.getCovered(),"covered boolean not false");
        assertEquals(true, empty.getCovered(),"covered boolean not false");
    }
}
