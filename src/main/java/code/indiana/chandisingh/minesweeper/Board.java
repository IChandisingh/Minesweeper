package code.indiana.chandisingh.minesweeper;
import java.util.ArrayList;
import java.util.List;

public class Board {
    //////////////////////////Attributes/////////////////////////////
    private int boardHeight;
    private int boardWidth;
    //number of bombs
    //board array?
     List<List> boardList = new ArrayList<>();
     private int bombRevealed=0;
     private int numOfTiles=0;
     private int tilesChecked=0;

    /////////////////////////Constructs/////////////////////////////



    /////////////////////////Methods////////////////////////////////
    /*
    public void setHeight(int newHeight) {
        this.boardHeight = newHeight;
    }
    */
    public void setBombRevealed(int bombRevealed) {
        this.bombRevealed = bombRevealed;
    }
    public boolean checkBombRevealed(){
        boolean check=bombRevealed>0;
        return check;
    }


    public List setBoardList(int height, int width){    //makes array of tiles as the board.

        numOfTiles=height*width;
        boardHeight=height;
        boardWidth=width;

        for (int i=0; i<height; i++){

            List<Tile> row= new ArrayList<>();

            for (int n=0; n<width; n++){
                Tile tile=new Tile();
                row.add(tile);
            }
            boardList.add(row);
        }

        return boardList;
    }
   /* public String printBoard(){

        for(int i=0;i<boardHeight;i++){
          List row=boardList.get(i);
        }
    }
    */

    public void editBoardList(int row, int col){
        //Add in if statement to check that row and columns entered are on the board
        List obtainedRow = boardList.get(row);
        Tile tile= (Tile) obtainedRow.get(col);
        boolean check=tile.checkTileType();
        if (check==true){
            bombRevealed++;
        }
        else{
            //
        }
        tilesChecked++;

    }
    public boolean checkBoardClear(){
        if(tilesChecked==numOfTiles){
            return true;
        }
        else{
            return false;
        }
    }



}
