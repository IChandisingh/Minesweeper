package code.indiana.chandisingh.minesweeper;

public abstract class Tile {
    //////////////////////////Attributes/////////////////////////////
    //type- bomb or empty
    //private boolean covered;
    //flagged or not
    private boolean tileType;
    int value;
    int coordinates;



    /////////////////////////Constructs/////////////////////////////


    /////////////////////////Methods////////////////////////////////
    public void makeTile() { //make abstract and make tile in bomb and empty class?
        double randNum=Math.random();
        tileType= randNum<0.3;
    }
    public abstract int getValue();
    //public abstract flipTile();

    public void setTileType(boolean tileType){

        this.tileType=tileType;
    }
    public abstract boolean setTileType();


    /*public boolean flipTile(){
        cover=false;
    }
    public boolean flagTile(){
    }
    */



}
