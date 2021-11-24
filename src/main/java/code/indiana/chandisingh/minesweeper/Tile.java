package code.indiana.chandisingh.minesweeper;

public abstract class Tile<getTileType> {
    //////////////////////////Attributes/////////////////////////////
    //type- bomb or empty
    //flagged or not
    private boolean tileType;
    int value;
    int coordinates;
    private boolean covered;



    /////////////////////////Constructs/////////////////////////////


    /////////////////////////Methods////////////////////////////////
    public abstract int getValue();
    public abstract void setValue(int i);

    public int flipTile(){
        this.covered=false;
        return this.getValue();
    }
    public void setCovered(boolean covered) {
        this.covered = covered;
    }
    public boolean getCovered(){
        return this.covered;
    }


    public abstract boolean getTileType();

    public abstract boolean setTileType();






}
