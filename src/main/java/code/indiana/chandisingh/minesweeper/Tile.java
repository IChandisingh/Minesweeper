package code.indiana.chandisingh.minesweeper;

public class Tile {
    //////////////////////////Attributes/////////////////////////////
    //type- bomb or empty
    //private boolean cover = true;
    //flagged or not
    private boolean tileType;


    /////////////////////////Constructs/////////////////////////////


    /////////////////////////Methods////////////////////////////////
    public void makeTile() { //make abstract and make tile in bomb and empty class?
        double randDouble= Math.random();
        tileType= randDouble<0.3;

    }
    /*public boolean flipTile(){
        cover=false;
    }
    public boolean flagTile(){
    }
    */
    public boolean checkTileType(){
        return(tileType);
    }


}
