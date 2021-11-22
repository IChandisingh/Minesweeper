package code.indiana.chandisingh.minesweepertest;
import code.indiana.chandisingh.minesweeper.Tile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TileTest {

    @Test
    public void testCheckTileType(){
        Tile tile=new Tile();
        tile.setTileType(true);
        assertEquals(true,tile.checkTileType(),"Incorrect tile type returned.");
    }
}
