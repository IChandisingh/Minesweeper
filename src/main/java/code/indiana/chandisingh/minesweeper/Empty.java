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

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean setTileType() {
        return false;
    }

    public int flipTile(){
        return this.value;
    }

}
