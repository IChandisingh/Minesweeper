package code.indiana.chandisingh.minesweeper;

public class Empty extends Tile {
    //////////////////////////Attributes/////////////////////////////




    /////////////////////////Constructs/////////////////////////////


    /////////////////////////Methods////////////////////////////////
    //calculateValue
    public int getValue(){
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean setTileType() {
        return false;
    }
    //public int flipTile(){return this.value;}

    @Override
    public boolean getTileType() {
        return false;
    }
}
