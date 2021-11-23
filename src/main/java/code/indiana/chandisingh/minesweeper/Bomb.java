package code.indiana.chandisingh.minesweeper;

public class Bomb extends Tile {
    //////////////////////////Attributes/////////////////////////////
    int value=9;


    /////////////////////////Constructs/////////////////////////////



    /////////////////////////Methods////////////////////////////////


    //public String flipTile(){return"You exploded!";}

    public void setValue(int value) {
        this.value = 9;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public boolean setTileType() {
        return true;
    }

    @Override
    public boolean getTileType() {
        return true;
    }
}
