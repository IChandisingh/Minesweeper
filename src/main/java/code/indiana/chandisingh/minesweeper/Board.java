package code.indiana.chandisingh.minesweeper;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    //////////////////////////Attributes/////////////////////////////
    //private int boardHeight;
    //private int boardWidth;
    //number of bombs
    //board array?
     List<List> tileBoard = new ArrayList<>();
     List<List> printBoard = new ArrayList<>();
     private int bombRevealed;
     private int numOfTiles;
     private int tilesChecked;

    /////////////////////////Constructs/////////////////////////////



    /////////////////////////Methods////////////////////////////////
    /*
    public void setHeight(int newHeight) {
        this.boardHeight = newHeight;
    }
    */
    public void setNumOfTiles(int height, int width){
        this.numOfTiles=height*width;
    }

    public int getNumOfTiles(){
        return this.numOfTiles;
    }

    public boolean checkBombRevealed(){
        boolean check=bombRevealed>0;
        return check;
    }
    public void setTilesChecked(int num){
        this.tilesChecked=num;
    }
    public void setBombsRevealed(int num){
        this.bombRevealed=num;
    }

    public List setBoardList(int height, int width){    //makes array of tiles as the board.

        this.numOfTiles=height*width;
        for (int i=0; i<height; i++){
            List<Tile> tileRow= new ArrayList<>();
            List<Integer> printRow= new ArrayList<Integer>();
            for (int n=0; n<width; n++){
                Random random = new Random();
                int randNum=random.nextInt(9);
                if (randNum<3){
                    Tile tile = new Bomb();
                    tileRow.add(tile);
                    printRow.add(tile.getValue());
                }
                else{
                    Tile tile = new Empty();
                    tileRow.add(tile);
                    printRow.add(0);
                }



            }
            tileBoard.add(tileRow);
            printBoard.add(printRow);
        }
        return printBoard;
    }
   /* public String printBoard(){

        for(int i=0;i<boardHeight;i++){
          List row=boardList.get(i);
        }
    }
    */

    public void editBoardList(int row, int col){
        //Add in if statement to check that row and columns entered are on the board
        List obtainedRow = tileBoard.get(row);
        Tile tile= (Tile) obtainedRow.get(col);
        boolean check=tile.checkTileType();
        if (check){
            bombRevealed++;
        }
        else{
            //
        }
        tilesChecked++;

    }
    public boolean checkBoardClear() {
        boolean boardCleared = this.tilesChecked == this.numOfTiles;
        return boardCleared;
    }



}
