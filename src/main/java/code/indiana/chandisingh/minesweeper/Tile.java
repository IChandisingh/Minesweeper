package code.indiana.chandisingh.minesweeper;

public class Tile {
    //////////////////////////Attributes/////////////////////////////
    //type- bomb or empty
    //private boolean cover = true;
    //flagged or not
    private boolean tileType;


    /////////////////////////Constructs/////////////////////////////


    /////////////////////////Methods////////////////////////////////
    public void makeTile() {
        double randDouble= Math.random();
        boolean check = randDouble<0.3;
        if(check){
            tileType=true;
        }
        else{
            tileType=false;
        }

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
