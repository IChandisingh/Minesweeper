package code.indiana.chandisingh.minesweeper;
import java.util.ArrayList;
import java.util.List;


public class Board {
    //////////////////////////Attributes/////////////////////////////
    //private int boardHeight;
    //private int boardWidth;
    //number of bombs
    //board array?
     List<List> tileBoard = new ArrayList<>();
     //Tile[][] tileBoard;
     List<List> printBoard = new ArrayList<>();
     private int bombRevealed;
     private int numOfTiles;
     private int tilesChecked;
     private int numOfBombs;
     private int bombsPlaced;

    /////////////////////////Constructs/////////////////////////////



    /////////////////////////Methods////////////////////////////////
    /*
    public void setHeight(int newHeight) {
        this.boardHeight = newHeight;
    }
    */

    /*
    public void makeBoard(int height, int width){
        this.numOfTiles=height*width;
        this.numOfBombs=Math.round(numOfTiles/3);
        this.tileboard=new Tile[height][width];
        for (int i=0; i<height; i++){
        }
    }

     */
    public void setBombsPlaced(int num) {
        this.bombsPlaced=num;
    }

    public int getBombsPlaced() {
        return bombsPlaced;
    }

    public void setNumOfTiles(int height, int width){
        this.numOfTiles=height*width;
    }

    public int getNumOfTiles(){
        return this.numOfTiles;
    }

    public int getTilesChecked() {
        return this.tilesChecked;
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
    public int getBombRevealed(){
        return this.bombRevealed;
    }

    public List setBoardList(int height, int width){    //makes array of tiles as the board - change to set num of bombs to count for test


        this.numOfBombs=Math.round(numOfTiles/3);

        this.numOfTiles=height*width;
        for (int i=0; i<height; i++) {
            List<Tile> tileRow = new ArrayList<>();
            List<Integer> printRow = new ArrayList<>();
            for (int n = 0; n < width; n++) {
                Tile tile = new Empty();
                tileRow.add(tile);
                printRow.add(0);
            }
            tileBoard.add(tileRow);
            printBoard.add(printRow);

        }
        while (bombsPlaced<numOfBombs){
            int randHeight= (int) (Math.random()*height);
            int randWidth= (int) (Math.random()*width);

            List obtainedRow = tileBoard.get(randHeight);
            Tile tile= (Tile) obtainedRow.get(randWidth);

            int index1 = obtainedRow.indexOf(tile);

            tile= new Bomb();

            obtainedRow.set(index1, tile);

            int index2=tileBoard.indexOf(obtainedRow);

            tileBoard.set(index2, obtainedRow);

        }

        return printBoard;
    }
            //tileBoard.add(tileRow);
            //printBoard.add(printRow);

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
        int check=tile.getValue();
        if (check==9){
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
