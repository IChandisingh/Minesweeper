package code.indiana.chandisingh.minesweeper;

public abstract class Tile<getTileType> {
    //////////////////////////Attributes/////////////////////////////
    //type- bomb or empty
    //private boolean covered;
    //flagged or not
    private boolean tileType;
    int value;
    int coordinates;



    /////////////////////////Constructs/////////////////////////////


    /////////////////////////Methods////////////////////////////////
    public abstract int getValue();
    public abstract void setValue(int i);
    //public abstract flipTile();


    public abstract boolean getTileType();

    public abstract boolean setTileType();






}
