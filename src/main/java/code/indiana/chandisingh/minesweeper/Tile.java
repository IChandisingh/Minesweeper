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
    //public abstract flipTile();

    public void setTileType(boolean tileType){

        this.tileType=tileType;
    }
    public boolean getTileType(){
        return this.tileType;
    }
    public abstract boolean setTileType();

    public abstract void setValue(int i);




}
