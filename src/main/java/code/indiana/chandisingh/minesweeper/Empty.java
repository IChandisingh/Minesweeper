package code.indiana.chandisingh.minesweeper;

public class Empty extends Tile {
    //////////////////////////Attributes/////////////////////////////
    //private int bombsTotal;
    int value;


    /////////////////////////Constructs/////////////////////////////


    /////////////////////////Methods////////////////////////////////
    //makeEmpty
    //calculateValue
    public int getValue(){
        return this.value;
    }

    @Override
    public boolean setTileType() {
        return false;
    }

    public int flipTile(){
        return this.value;
    }

}
