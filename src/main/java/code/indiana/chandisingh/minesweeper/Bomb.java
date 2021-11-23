package code.indiana.chandisingh.minesweeper;

public class Bomb extends Tile {
    //////////////////////////Attributes/////////////////////////////
    int value=9;


    /////////////////////////Constructs/////////////////////////////



    /////////////////////////Methods////////////////////////////////


    public String flipTile(){

        return"You exploded!";
    }


    public int getValue(){
        return this.value;
    }

    @Override
    public boolean setTileType() {
        return true;
    }


}
